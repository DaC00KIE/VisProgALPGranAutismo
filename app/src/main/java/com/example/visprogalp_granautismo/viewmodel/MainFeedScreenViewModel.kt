package com.example.visprogalp_granautismo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.visprogalp_granautismo.model.PostResponse
import com.example.visprogalp_granautismo.model.User
import retrofit2.Response

sealed interface FeedUIState{
    data class Success(val userInSession: Response<User>, val allPosts: Response<List<PostResponse>>);
    object Error : FeedUIState
    object Loading : FeedUIState
}

class MainFeedScreenViewModel:ViewModel() {
    var feedUIState: FeedUIState by mutableStateOf(FeedUIState.Loading)
        private set

    
}