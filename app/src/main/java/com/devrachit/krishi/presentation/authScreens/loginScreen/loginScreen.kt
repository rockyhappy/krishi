package com.devrachit.krishi.presentation.authScreens.loginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.devrachit.krishi.common.constants.customFontFamily
import com.devrachit.krishi.navigation.AuthScreens
import com.devrachit.krishi.presentation.authScreens.languageChoiceScreen.components.Heading
import com.devrachit.krishi.presentation.authScreens.languageChoiceScreen.components.ImageLogo
import com.devrachit.krishi.presentation.authScreens.signupScreen.components.BackBoxSignup2
import com.devrachit.krishi.presentation.authScreens.signupScreen.components.SignupButton
import com.devrachit.krishi.presentation.authScreens.signupScreen.components.errorFeild
import com.devrachit.krishi.ui.theme.errorColor
import com.devrachit.krishi.ui.theme.gray
import com.devrachit.krishi.ui.theme.primaryVariantColor1

@Composable
fun loginScreen(navController: NavController) {
    val viewModel: LoginViewModel = hiltViewModel()
    val nameState = remember { mutableStateOf(TextFieldValue()) }
    val numberState = remember { mutableStateOf(TextFieldValue()) }

    val onGetOtpClicked : () -> Unit = {
        navController.navigate(AuthScreens.OtpScreen.route)
    }

    val onLoginClicked : () -> Unit = {
        navController.navigate(AuthScreens.RegisterScreen.route){
            popUpTo(AuthScreens.LoginScreen.route){
                inclusive = true
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
//            contentAlignment = Alignment.TopCenter
        ) {
            BackBoxSignup2()
            Heading(
                heading = if (viewModel.sharedViewModel.language.collectAsStateWithLifecycle().value == "English") "Login" else "लॉग इन",
                modifier = Modifier
                    .padding(top = 76.dp, start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
            )
            ImageLogo(
                modifier = Modifier
                    .padding(top = 190.dp)
                    .align(Alignment.TopCenter)
            )
            OutlinedTextField(
                value = nameState.value,
                onValueChange = { nameState.value = it },
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                modifier = Modifier
                    .padding(top = 400.dp, start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                label = {
                    Text(
                        text = if (viewModel.sharedViewModel.language.collectAsStateWithLifecycle().value == "English") "Name" else "नाम",
                        fontFamily = customFontFamily
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = if (viewModel.nameValid.value) primaryVariantColor1 else errorColor,
                    focusedLabelColor = if (viewModel.nameValid.value) primaryVariantColor1 else errorColor,
                    cursorColor = if (viewModel.nameValid.value) primaryVariantColor1 else errorColor,
                    unfocusedBorderColor = if (viewModel.nameValid.value) gray else errorColor,
                    unfocusedLabelColor = if (viewModel.nameValid.value) gray else errorColor,
                    focusedTextColor = if (viewModel.nameValid.value) Color.Black else errorColor,
                    unfocusedTextColor = if (viewModel.nameValid.value) Color.Black else errorColor
                )
            )
            errorFeild(text = "Error Fields", modifier = Modifier.padding(top = 470.dp))
            OutlinedTextField(
                value = numberState.value,
                onValueChange = { numberState.value = it },
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                modifier = Modifier
                    .padding(top = 500.dp, start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                label = {
                    Text(
                        text = if (viewModel.sharedViewModel.language.collectAsStateWithLifecycle().value == "English") "Mobile Number" else "मोबाइल नंबर",
                        fontFamily = customFontFamily
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = if (viewModel.numberValid.value) primaryVariantColor1 else errorColor,
                    focusedLabelColor = if (viewModel.numberValid.value) primaryVariantColor1 else errorColor,
                    cursorColor = if (viewModel.numberValid.value) primaryVariantColor1 else errorColor,
                    unfocusedBorderColor = if (viewModel.numberValid.value) gray else errorColor,
                    unfocusedLabelColor = if (viewModel.numberValid.value) gray else errorColor,
                    focusedTextColor = if (viewModel.numberValid.value) Color.Black else errorColor,
                    unfocusedTextColor = if (viewModel.numberValid.value) Color.Black else errorColor
                ),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = androidx.compose.ui.text.input.KeyboardType.Number)
            )
            errorFeild(text = "Error Fields", modifier = Modifier.padding(top = 570.dp))
            SignupButton(
                text = if(viewModel.sharedViewModel.language.collectAsStateWithLifecycle().value == "English") "Get Otp" else "OTP प्राप्त करें",
                onClick = { onGetOtpClicked()},
                modifier = Modifier
                    .padding(top = 630.dp, start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
            )
            Text(
                text=if(viewModel.sharedViewModel.language.collectAsStateWithLifecycle().value == "English") "Create an account? Click Here" else "खाता बनाएं? यहाँ क्लिक करें",
                modifier = Modifier
                    .padding(top = 710.dp, start = 16.dp, end = 16.dp, bottom = 200.dp)
                    .fillMaxWidth()
                    .clickable { onLoginClicked() },
                textAlign = TextAlign.Center,
                fontFamily = customFontFamily,
                fontSize = 12.sp
            )

        }


    }
}