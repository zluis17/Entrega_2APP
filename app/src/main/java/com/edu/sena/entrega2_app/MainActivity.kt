package com.edu.sena.entrega2_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.edu.sena.entrega2_app.ui.theme.Entrega2_APPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Entrega2_APPTheme {
             Surface(
                 modifier = Modifier.fillmaxSize(),
                 color = MaterialTheme.colorSheme.background

                    ) {
                 LoginScrenn()
             }
                }
            }
        }
    }

@Composable
fun LoginScrenn(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Text(text = "Login", style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = "username", Style = MaterialTheme.typograpthy.bodyLarge, modifier = Modifier.padding(bottom = 8.dp))
    }

}
@Preview(showBackground = true)
@Composable
fun loginScreenPreview() {
    LoginScrenn()
}