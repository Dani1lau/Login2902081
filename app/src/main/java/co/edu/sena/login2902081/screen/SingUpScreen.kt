package co.edu.sena.login2902081.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login2902081.R
import co.edu.sena.login2902081.components.HeadingTextComponent
import co.edu.sena.login2902081.components.NormalTextComponent
import co.edu.sena.login2902081.components.MyTextField
import androidx.compose.ui.res.painterResource

@Composable
fun SingUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.name),
                painterResource(id = R.drawable.person_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.last_name),
                painterResource(id = R.drawable.person_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.mail_24px)
            )
        }//Column
    }//Surface
}//SingUpScreen

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
    SingUpScreen()
}