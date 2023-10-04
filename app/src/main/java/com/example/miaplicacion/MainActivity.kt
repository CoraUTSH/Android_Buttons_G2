package com.example.miaplicacion

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.res.colorResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.ui.theme.MiAplicacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiAplicacionTheme {
                Pantalla()
            }//FinalizaTemaAplicacion
        }//FinalizasetContent
    }//FinalizaOncreate
}//Finaliza el mainActivity
@Composable
fun Pantalla(){
    Column(
        modifier = Modifier
            .background(colorResource(id = R.color.background))
            .fillMaxSize()
    ) {
        Mensajes("Francisco")
        Mensajes("Nestor")
        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp),

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically


        ) {
            Text(text = "Texto 1")
Spacer(modifier=Modifier.width(15.dp))
            val context=LocalContext.current
            Button(
                onClick = { /*TODO*/
                          Toast.makeText(context,"Haz dado Clic!!!",Toast.LENGTH_LONG).show()
                          },//Función Click

                enabled = true, //Habilitar y deshabilitar
                border= BorderStroke(width = 2.dp,Color.White),//Color de Borde
                colors = ButtonDefaults.buttonColors(
                                                    Color.LightGray,
                                                    contentColor = Color.Red), //Color de Fondo y texto
                shape = RoundedCornerShape(topStart = 10.dp, bottomEnd =15.dp)

            )
               {
                Text(text = "Dar Click")
            }

            Spacer(modifier=Modifier.width(15.dp))
            Text(text = "Texto 2")

        }
    }
}
@Composable //Permite crear un componente
fun Mensajes(nombre:String){ //Se crea un componente mediante una función
    Text(text = "Bienvenid@ a mi aplicación, $nombre",
        color= Color.Black,
        fontSize = 24.sp
        )
}
@Preview(showSystemUi = true)
@Composable
fun MiVista(){
Pantalla()

}