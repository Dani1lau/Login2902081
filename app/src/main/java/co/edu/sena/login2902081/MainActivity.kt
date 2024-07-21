package co.edu.sena.login2902081

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.login2902081.screen.SingUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SingUpScreen()
        } //setContent
    } //onCreate
} //MainActivity

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    MainActivity()
}