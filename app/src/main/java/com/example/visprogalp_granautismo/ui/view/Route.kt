package com.example.visprogalp_granautismo.ui.view

import CreatePostFeature
import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.visprogalp_granautismo.data.DataStoreManager
import com.example.visprogalp_granautismo.repository.GranAutismoContainer
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.view.loginpage.SignIn
import com.example.visprogalp_granautismo.ui.view.profile.Bookmark
import com.example.visprogalp_granautismo.ui.view.profile.EditProfile
import com.example.visprogalp_granautismo.ui.view.profile.Followers
import com.example.visprogalp_granautismo.ui.view.profile.Following
import com.example.visprogalp_granautismo.ui.view.profile.MyProfile
import com.example.visprogalp_granautismo.ui.view.screens.ChatScreen
import com.example.visprogalp_granautismo.ui.view.screens.Explore
import com.example.visprogalp_granautismo.ui.view.screens.HomeScreen
import com.example.visprogalp_granautismo.ui.view.screens.MainFeedScreen
import com.example.visprogalp_granautismo.viewmodel.LoginViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
enum class ListScreen() {
    Login,
    MainFeedScreen,
    Explore,
    home_screen,
    MyProfile,
    chat_screen,
    AnotherUSer,
    EditProfile,
    Bookmark,
    Following,
    Followers,
    CreatePostFeature


}

sealed class BottomNavBar(var menu: String, var icon: ImageVector, var route: String) {
    object MainFeedScreen : BottomNavBar("Home", Icons.Outlined.Home, ListScreen.MainFeedScreen.name)
    object Explore : BottomNavBar("Weekly", Icons.Outlined.Search, ListScreen.Explore.name)
    object CreatePostFeature : BottomNavBar("Weekly", Icons.Outlined.Add, ListScreen.CreatePostFeature.name)
    object home_screen : BottomNavBar("Group", Icons.Outlined.MailOutline, ListScreen.home_screen.name)
    object MyProfile : BottomNavBar("Urgency", Icons.Outlined.Person, ListScreen.MyProfile.name)
}

@Composable
fun BottomNavBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val items = listOf(
        BottomNavBar.MainFeedScreen,
        BottomNavBar.Explore,
        BottomNavBar.CreatePostFeature,
        BottomNavBar.home_screen,
        BottomNavBar.MyProfile
    )

    NavigationBar(
        modifier = Modifier
            .shadow(
                elevation = 15.dp, spotColor = Color(0xFF000000), ambientColor = Color(
                    0xFF000000
                ), shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)
            )
            .background(
                color = Color(0xFFF0F0F0),
                shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)
            ),
    ) {
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.menu)
                },
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route)
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor =
                        LightPinkBG
                ),
            )
        }
    }
}


@SuppressLint("CoroutineCreationDuringComposition")
@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class, DelicateCoroutinesApi::class)
@Composable
fun Route(
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    val navController = rememberNavController()
    var canNavigate by remember { mutableStateOf(false) }
    val dataStore = DataStoreManager(LocalContext.current)

    GlobalScope.launch {
        dataStore.getToken.collect { token ->
            if (token != null) {
                GranAutismoContainer.ACCESS_TOKEN = token
            }
        }
    }

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        bottomBar = {
            if (canNavigate) {
                BottomNavBar(navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = ListScreen.Login.name,
            modifier = Modifier
                .padding(innerPadding)
        ) {
            composable(ListScreen.Login.name){
                if(GranAutismoContainer.ACCESS_TOKEN.isEmpty()){
                    val loginViewModel: LoginViewModel = viewModel()
                    SignIn(
                        loginViewModel = loginViewModel,
                        navController = navController,
                        dataStore = dataStore
                    )
                }else{
                    navController.navigate(ListScreen.MainFeedScreen.name){
                        popUpTo(ListScreen.Login.name) { inclusive = true }
                    }
                }
            }

            composable(ListScreen.MainFeedScreen.name) {
                canNavigate = true
//                val homeViewModel: HomeViewModel = viewModel()
                MainFeedScreen()
            }

            composable(ListScreen.Explore.name) {
                canNavigate = true
              Explore(navController)            }



            composable(ListScreen.home_screen.name) {
                canNavigate = true
                HomeScreen(navController)
            }
            composable(ListScreen.MyProfile.name) {
                canNavigate = true
                MyProfile(navController)
            }
            composable(ListScreen.chat_screen.name) {
                canNavigate = true
                ChatScreen(navController)
            }
            composable(ListScreen.EditProfile.name) {
                canNavigate = true
                EditProfile()
            }
            composable(ListScreen.Bookmark.name) {
                canNavigate = true
                Bookmark()
            }
            composable(ListScreen.Followers.name) {
                canNavigate = true
                Followers()
            }
            composable(ListScreen.Following.name) {
                canNavigate = true
                Following()
            }
            composable(ListScreen.CreatePostFeature.name) {
                canNavigate = true

                CreatePostFeature()
            }

//            composable(ListScreen.SignIn.name) {
//                if (MyDBContainer.ACCESS_TOKEN.isEmpty()) {
//                    canNavigate = false
//                    val signInViewModel: SignInViewModel = viewModel()
//                    SignInView(
//                        navController = navController,
//                        signInViewModel = signInViewModel,
//                        dataStore = dataStore
//                    )
//                } else {
//                    navController.navigate(ListScreen.Home.name) {
//                        popUpTo(ListScreen.SignIn.name) { inclusive = true }
//                    }
////                    val signInViewModel: SignInViewModel = viewModel()
////                    SignInView(
////                        navController = navController,
////                        signInViewModel = signInViewModel,
////                        dataStore = dataStore
////                    )
//                }
//            }
//
//            composable(ListScreen.SignUp.name) {
//                canNavigate = false
//                val signUpViewModel: SignUpViewModel = viewModel()
//                SignUpView(
//                    navController = navController,
//                    signUpViewModel = signUpViewModel,
//                    dataStore = dataStore
//                )
//            }
//
//            composable(ListScreen.EditProfile.name) {
//                canNavigate = true
//                EditProfileView(navController = navController)
//            }
//
//            composable(ListScreen.Authentication.name) {
//                AuthenticationView(navController = navController)
//            }
        }

    }
}
