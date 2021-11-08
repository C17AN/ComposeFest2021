package com.codelab.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basics.ui.BasicsCodelabTheme

// 레포지토리 푸시 테스트
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                MyApp()
//                Text("hi")
            }
        }
    }
}

//@Composable
//private fun MyApp() {
//    Surface(color = MaterialTheme.colors.background) {
//        Greeting("Android")
//    }
//}

@Composable
private fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            Row() {
                Text(text = "Hello, $name", modifier = Modifier.weight(1.0F))
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text("Show More")
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun MyApp(nameList: List<String> = listOf("Chanmin", "David")) {
    Surface(color = MaterialTheme.colors.primary) {
        Column(modifier = Modifier.padding(vertical = 4.dp)) {
            for (name in nameList) {
                Greeting(name)
            }
        }
    }
}
