package com.example.visprogalp_granautismo.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.datastore.core.DataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.visprogalp_granautismo.data.DataStoreManager
import com.example.visprogalp_granautismo.repository.GranAutismoContainer
import com.example.visprogalp_granautismo.ui.view.ListScreen
import kotlinx.coroutines.launch

class LoginViewModel:ViewModel() {

    fun Login(
        email:String,
        password:String,
        context: Context,
        navController: NavController,
        dataStore: DataStoreManager
    ){
        viewModelScope.launch {
            val token = GranAutismoContainer().GranAutismoRepository.login(email, password)
            if(token.equals("Incorrect Password", true)){
                Toast.makeText(context, token, Toast.LENGTH_LONG).show()
            }else if(token.equals("User not found", true)){
                Toast.makeText(context, token, Toast.LENGTH_LONG).show()
            }else{
                navController.navigate(ListScreen.MainFeedScreen.name){
                    popUpTo(ListScreen.Login.name){inclusive = true}
                }
                dataStore.saveToken(token)

                dataStore.getToken.collect{
                    if(token != null){
                        GranAutismoContainer.ACCESS_TOKEN = token
                    }
                }
            }
        }
    }
}