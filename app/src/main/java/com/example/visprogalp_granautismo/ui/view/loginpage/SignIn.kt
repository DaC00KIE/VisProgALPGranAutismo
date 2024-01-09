package com.example.visprogalp_granautismo.ui.view.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.data.DataStoreManager
import com.example.visprogalp_granautismo.ui.theme.LightPinkBG
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.example.visprogalp_granautismo.viewmodel.LoginViewModel
import java.util.regex.Pattern

@Composable
fun SignIn(
    loginViewModel: LoginViewModel,
    navController: NavController,
    dataStore: DataStoreManager
) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    var isEmailValid by rememberSaveable { mutableStateOf(true) }
    var isPasswordValid by rememberSaveable { mutableStateOf(true) }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(LightPinkBG),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.logoinstayum1),
            contentDescription = "logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                )
                .width(120.dp)
                .height(120.dp)
        )
        Text(
            text = "Instayum",
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily(Font(R.font.satisfy)),
                fontWeight = FontWeight(400),
                color = Color.White,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Column(
            modifier = Modifier
                .width(430.dp)
                .height(500.dp)
                .background(
                    color = Color(0xFFFFFFFF), shape = RoundedCornerShape(
                        topStart = CornerSize(60.dp),
                        topEnd = CornerSize(60.dp),
                        bottomStart = CornerSize(0.dp),
                        bottomEnd = CornerSize(0.dp)
                    )
                )
        ) {
            Text(
                text = "Sign in",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF6A6675),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 50.dp, start = 50.dp)
            )
            Text(
                text = "Email",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF9C9C9C),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 40.dp, start = 50.dp)
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 50.dp)
            ){
                Row (
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "email",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
//                    Text(
//                        text = "Enter your email",
//                        style = TextStyle(
//                            fontSize = 14.sp,
//                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
//                            fontWeight = FontWeight(500),
//                            color = Color(0xFF9C9C9C),
//                            textAlign = TextAlign.Center,
//                        ),
//                        modifier = Modifier
//                            .padding(top = 5.dp)
//                    )
                    CustomEmailField(
                        value = email,
                        onValueChanged = {email = it},
                        text = "Email",
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Email,
                        ),
                        isEmailValid = isEmailValid,
                        colorContainer = Color.Black,
                        colorBorder = Color.Black,
                        colorCursor = Color.Black,
                        colorLabel = Color.Black,
                        colorLabelFocused = Color.Black,
                        colorBorderFocused = Color.Black
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Divider(
                    color = Color(0xFF9C9C9C),
                    thickness = 0.2.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, end = 35.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Password",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_bold)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF9C9C9C),
                        textAlign = TextAlign.Center,
                    )
                )
                Row (
                    modifier = Modifier
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        text = "Password",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF9C9C9C),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Box(
                        modifier = Modifier
                            .padding(start = 140.dp)
                    ){
                    Image(
                        painter = painterResource(id = R.drawable.eyepass),
                        contentDescription = "eye pass",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Divider(
                    color = Color(0xFF9C9C9C),
                    thickness = 0.2.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, end = 35.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = {
                        isEmailValid = isValidEmail(email)
                        isPasswordValid = isValidPassword(password)

                        if (isEmailValid && isPasswordValid){
                            loginViewModel.Login(
                                email,
                                password,
                                context,
                                navController,
                                dataStore
                            )
                        } },
                    enabled = email.isNotBlank() && password.isNotBlank(),
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .width(260.dp)
                        .height(55.dp)
                        .background(
                            color = Color.Transparent,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                ){
                    Text(
                        text = "Login",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(800),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                        )
                    )
                }
                Row (
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ){
                    Text(
                        text = "Don’t have an account yet?",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFD9A3B0),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp, start = 10.dp)
                    )
                    Text(
                        text = "Sign Up",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.raleway_bold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFD9A3B0),
                            textAlign = TextAlign.Center,
                            textDecoration = TextDecoration.Underline
                        ),
                        modifier = Modifier
                            .padding(top = 15.dp, start = 10.dp)
                            .clickable { }
                    )
                }
            }
        }
    }
}

// Function to validate email using regex
fun isValidEmail(email: String): Boolean {
    val emailPattern = Pattern.compile(
        "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$",
        Pattern.CASE_INSENSITIVE
    )
    return emailPattern.matcher(email).matches()
}

// Function to validate password
fun isValidPassword(password: String): Boolean {
    val passwordPattern = Pattern.compile(
        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+\$).{8,}\$"
    )
    return passwordPattern.matcher(password).matches()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEmailField(
    value: String,
    onValueChanged: (String) -> Unit,
    text: String,
    keyboardOptions: KeyboardOptions,
    modifier: Modifier = Modifier,
    isEmailValid: Boolean,
    colorContainer: Color,
    colorBorder: Color,
    colorCursor: Color,
    colorLabel: Color,
    colorLabelFocused: Color,
    colorBorderFocused: Color
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(text = text)},
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        isError = !isEmailValid,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = colorContainer,
            unfocusedBorderColor = colorBorder,
            cursorColor = colorCursor,
            unfocusedLabelColor = colorLabel,
            focusedLabelColor = colorLabelFocused,
            focusedBorderColor = colorBorderFocused
        )
    )

    if (!isEmailValid){
        Text(
            text = "Invalid email format",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 4.dp),
            Color.Red
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomPasswordField(
    value: String,
    onValueChanged: (String) -> Unit,
    text: String,
    keyboardOptions: KeyboardOptions,
    modifier: Modifier = Modifier,
    isPasswordValid: Boolean,
    colorContainer: Color,
    colorBorder: Color,
    colorCursor: Color,
    colorLabel: Color,
    colorLabelFocused: Color,
    colorBorderFocused: Color
){

    var isPasswordVisible by remember { mutableStateOf(false)}

    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(text = text)},
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        isError = !isPasswordValid,
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
//            IconButton(
//                onClick = { isPasswordVisible = !isPasswordVisible }
//            ) {
////                Icon(
////                    imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
////                    contentDescription = if (isPasswordVisible) "Hide password" else "Show password"
////                )
//            }
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = colorContainer,
            unfocusedBorderColor = colorBorder,
            cursorColor = colorCursor,
            unfocusedLabelColor = colorLabel,
            focusedLabelColor = colorLabelFocused,
            focusedBorderColor = colorBorderFocused
        )
    )

    if (!isPasswordValid){
        Text(
            text = "Password must be 8 characters long and contain uppercase, lowercase, number, and special character",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 4.dp),
            Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
//    SignIn()
}