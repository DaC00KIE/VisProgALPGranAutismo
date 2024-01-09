//package com.example.visprogalp_granautismo.viewmodel
//
//import androidx.lifecycle.ViewModel
//import com.example.visprogalp_granautismo.model.Ingredient
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.asStateFlow
//
//sealed interface ProfileUIState {
//    data class Success(val userInSessionDetails: Response<UserResponse>, val userInSession: Response<User>) : ProfileUIState
//    object Error : ProfileUIState
//    object Loading : ProfileUIState
//
//}
//
//class CreatePostViewModel : ViewModel() {
//    private val _uiState = MutableStateFlow(Ingredient())
//    val uiState: StateFlow<Ingredient> = _uiState.asStateFlow()
//
//    private val ingredientList: ArrayList<Ingredient> = ArrayList()
//
//    // Function to add an Ingredient to the ArrayList
//    fun addIngredient(id: Int, name: String) {
//        val ingredient = Ingredient(id, name)
//        ingredientList.add(ingredient)
//    }
//
//    // You can add more functions to manipulate the list as needed
//
//    // Getter to access the ingredientList
//    fun getIngredientList(): ArrayList<Ingredient> {
//        return ingredientList
//    }
//
//
//}
