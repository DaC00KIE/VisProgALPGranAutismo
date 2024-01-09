
package com.example.visprogalp_granautismo.repository

import android.content.Context
import android.net.Uri
import com.example.visprogalp_granautismo.model.LoginResponse
import com.example.visprogalp_granautismo.model.Post
import com.example.visprogalp_granautismo.model.User
import com.example.visprogalp_granautismo.service.GranAutismoService
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Response
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection

class GranAutismoRepository(private val granAutismoService: GranAutismoService) {

    // Auth
    suspend fun login(email: String, password: String): LoginResponse {
        val user = User(email = email, password = password)
        return granAutismoService.login(user)
    }


    suspend fun logout(token: String) {
        granAutismoService.logout(token)
    }

    suspend fun register(

        email: String,
        password: String,
        name: String,
       bio: String,
        location: String,
displayName: String,
        profilePicture: Uri,
        context: Context
    ): String {


        val emailPart = email.toRequestBody("text/plain".toMediaTypeOrNull())
        val passwordPart = password.toRequestBody("text/plain".toMediaTypeOrNull())
        val namePart = name.toRequestBody("text/plain".toMediaTypeOrNull())
        val bioPart = "".toRequestBody("text/plain".toMediaTypeOrNull()) // Placeholder for bio, replace with the actual value
        val locationPart = "".toRequestBody("text/plain".toMediaTypeOrNull()) // Placeholder for email_verified_at, replace with the actual value

        val displayNamePart = "".toRequestBody("text/plain".toMediaTypeOrNull()) // Placeholder for tag_name, replace with the actual value

        val fileDir = context.filesDir
        val file = File(fileDir, "image.png")
        val inputStream = context.contentResolver.openInputStream(profilePicture)
        inputStream?.use { input ->
            val outputStream = FileOutputStream(file)
            outputStream.use { output ->
                input.copyTo(output)
            }
        }
        val requestBody = file.asRequestBody("image/*".toMediaTypeOrNull())
        val part = MultipartBody.Part.createFormData("file", file.name, requestBody)
        val profilePicturePart = MultipartBody.Part.createFormData("profile_picture", file.name, requestBody)

        val result = granAutismoService.register(

            email = emailPart,
            password = passwordPart,
            name = namePart,
            bio = bioPart,
            profilePicture = profilePicturePart,
            displayName = displayNamePart,
            location = locationPart,
            file = part

        )

        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
            return result.data as String
        }
        return result.message
    }

    // Auth

    // User
    suspend fun getUser(token: String): Response<User> {
        return granAutismoService.getUser(token)
    }
    suspend fun getPost(token: String): Response<Post> {
        return granAutismoService.getPost(token)
    }

//    suspend fun getUserDetails(token: String, id: Int): Response<UserResponse> {
//        return granAutismoService.viewUserDetails(token, id)
//    }
//
//    suspend fun getUsers(token: String): Response<List<UserResponse>> {
//        return granAutismoService.viewUser(token)
//    }
//    suspend fun deleteUser(token: String, id: Int): APIResponse {
//        val result = granAutismoService.deleteUser(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//    }
//    suspend fun followUser(token: String, id: Int): APIResponse {
//        val result = granAutismoService.followUser(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//    }
//    suspend fun unfollowUser(token: String, id: Int): APIResponse {
//        val result = granAutismoService.unfollowUser(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//    }
//    // User
//
//    // Recipe
//    suspend fun createRecipe(
//        token: String,
//        recipe_name: String,
//        caption: String,
//        ingredients: String,
//        steps: String,
//        image: Uri,
//        calorie: Int,
//        servings: Int,
//        time: Int,
//        categories: List<Int>,
//        context: Context
//    ): String {
//        val userResponse =
//            granAutismoService.getUser(SavoriaContainer.ACCESS_TOKEN)
//
//        if (userResponse.isSuccessful) {
//            val user = userResponse.body()
//
//            val userJson = Gson().toJson(user)
//            val userRequestBody = userJson.toRequestBody("application/json".toMediaTypeOrNull())
//
//            val recipe_namePart = recipe_name.toRequestBody("text/plain".toMediaTypeOrNull())
//            val captionPart = caption.toRequestBody("text/plain".toMediaTypeOrNull())
//            val ingredientsPart = ingredients.toRequestBody("text/plain".toMediaTypeOrNull())
//            val stepsPart = steps.toRequestBody("text/plain".toMediaTypeOrNull())
//
//            val caloriePart = calorie.toString().toRequestBody("text/plain".toMediaTypeOrNull())
//            val servingsPart = servings.toString().toRequestBody("text/plain".toMediaTypeOrNull())
//            val timePart = time.toString().toRequestBody("text/plain".toMediaTypeOrNull())
//
//            val categoriesPart = categories.joinToString(",") { it.toString() }
//                .toRequestBody("text/plain".toMediaTypeOrNull())
//
//            val fileDir = context.filesDir
//            val file = File(fileDir, "image.png")
//
//            val inputStream = context.contentResolver.openInputStream(image)
//            inputStream?.use { input ->
//                val outputStream = FileOutputStream(file)
//                outputStream.use { output ->
//                    input.copyTo(output)
//                }
//            }
//
//            val requestBody = file.asRequestBody("image/*".toMediaTypeOrNull())
//
//            val part = MultipartBody.Part.createFormData("file", file.name, requestBody)
//
//            val result = granAutismoService.createRecipe(
//                token = token,
//                recipe_name = recipe_namePart,
//                caption = captionPart,
//                ingredients = ingredientsPart,
//                steps = stepsPart,
//                file = part,
//                calorie = caloriePart,
//                servings = servingsPart,
//                time = timePart,
//                categories = categoriesPart
//            )
//            if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//                return result.data as String
//            }
//            return result.message
//        } else {
//            // Handle the case when the user retrieval is not successful
//            return "User retrieval failed: ${userResponse.code()}"
//        }
//    }
//
//    suspend fun getRecipes(token: String): Response<List<RecipeResponse>> {
//        return granAutismoService.viewRecipe(token)
//    }
//
//    suspend fun getRecipeDetails(token: String, id: Int): Response<RecipeResponse> {
//        return granAutismoService.viewRecipeDetails(token, id)
//    }
//    suspend fun deleteRecipe(token: String, id: Int): APIResponse {
//        val result = granAutismoService.deleteRecipe(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//    }
//    suspend fun addFavorite(token: String, id: Int): APIResponse {
//        val result = granAutismoService.addFavorite(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//
//
//    }
//    suspend fun getFavoriteRecipes(token: String, id: Int): APIResponse {
//        return granAutismoService.viewFavorite(token, id)
//    }
//    // this one should be Response<List<RecipeResponses>>
//    suspend fun removeFavorite(token: String, id: Int): APIResponse {
//        val result = granAutismoService.deleteFavorite(token, id)
//        if (result.status.toInt() == HttpURLConnection.HTTP_OK) {
//            return result
//        }
//        return result
//    }
//
//    suspend fun getFollowRecipe(token: String): Response<List<RecipeResponse>> {
//        return granAutismoService.viewFollowedRecipe(token)
//    }
//
//    suspend fun searchRecipes(token: String, search: String): Response<List<RecipeResponse>> {
//        return granAutismoService.searchRecipes(token, search)
//    }
//
//    suspend fun getRecipeByCategory(token: String, id: Int): Response<List<RecipeResponse>> {
//        return granAutismoService.viewRecipeByCategory(token, id)
//    }
//
//    suspend fun getRecipeByUser(token: String, id: Int): Response<List<RecipeResponse>> {
//        return granAutismoService.viewRecipeByUser(token, id)
//    }
//
//    suspend fun getTopSavedRecipe(token: String): Response<List<RecipeResponse>> {
//        return granAutismoService.viewTopSavedRecipe(token)
//    }
    // Recipe

    // Category
    // Function unchanged
    // Category

    // Comment
    // Functions unchanged
    // Comment
}
