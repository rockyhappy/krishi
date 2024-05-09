package com.devrachit.krishi.presentation.authScreens.splashScreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.devrachit.krishi.R
import com.devrachit.krishi.presentation.authScreens.Auth
import com.devrachit.krishi.ui.theme.KrishiTheme
import com.devrachit.krishi.ui.theme.primaryVariantColor
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor = primaryVariantColor.toArgb()
            window.navigationBarColor = primaryVariantColor.toArgb()
            WindowCompat.setDecorFitsSystemWindows(window, false)
            WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true
            KrishiTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = primaryVariantColor),
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
                    verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center

                ) {
                        Image(painter = painterResource(id = R.drawable.peasant), contentDescription =null )
                        Text(
                            text = stringResource(id = R.string.app_name),
                            color = Color.Black,
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.font1)),
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            fontStyle = FontStyle.Normal,
                            modifier=Modifier.padding(20.dp)
                        )
                }
            }
            LaunchedEffect(key1=true)
            {
                CoroutineScope(Dispatchers.Main).launch {
                    delay(2000)
                    startActivity(Intent(this@MainActivity, Auth::class.java))
                    finish()
                }
            }

        }
    }
}
