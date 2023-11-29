package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Sayfa() {

    val tlfKullaniciAdi = remember { mutableStateOf("")}
    val tlfSifre = remember { mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally)
    /*ANA SAYFA COLUM BAŞLANGIÇ*/
    {

            Image(
                painter = painterResource(id = R.drawable.banka),
                contentDescription ="banka resmi",
                modifier = Modifier.size(200.dp))

            Text(text = "HOŞGELDİNİZ")


        /*Kullanıcı Adı BAŞLANGIÇ*/
        Row(verticalAlignment = Alignment.CenterVertically){
            Box()
            {
                Image(painter = painterResource(id = R.drawable.user), contentDescription ="User png")
            }
            Box()
            {
                TextField(
                    value = tlfKullaniciAdi.value,
                    onValueChange = { tlfKullaniciAdi.value = it },
                    label = { Text(text = "Kullanıcı Adı") },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White,
                        textColor = Color.Black,
                        focusedIndicatorColor = Color.Red
                    )
                )
            }

        }/*Kullanıcı Adı BİTİŞ*/

        /*Şifre BAŞLANGIÇ*/
        Row(verticalAlignment = Alignment.CenterVertically){
            Box()
            {
                Image(painter = painterResource(id = R.drawable.sifre), contentDescription ="Şifre png")
            }
            Box()
            {
                TextField(
                    value = tlfSifre.value,
                    onValueChange = { tlfSifre.value = it },
                    label = { Text(text = "Şifre") },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White,
                        textColor = Color.Black,
                        focusedIndicatorColor = Color.Red
                    )
                )
            }

        }/*Şifre BİTİŞ*/


        /*Giriş button BAŞLANGIÇ*/
        Button(
            onClick = {/*boş*/},
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.button),
                contentColor = Color.White
            ),
            modifier = Modifier.size(200.dp,50.dp)
            ){
            Text(text = "Giriş Yap")
        }/*Giriş button BİTİŞ*/

        /*Kayıt button BAŞLANGIÇ*/
        Button(
            onClick = {/*boş*/},
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.button),
                contentColor = Color.White
            ),
            modifier = Modifier.size(200.dp,50.dp)
        ){
            Text(text = "Kayıt ol")
        }/*Kayıt button BİTİŞ*/



    }/*ANA SAYFA COLUM BİTİŞ*/
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
        Sayfa()
    }
}