package com.example.calculadorapropinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.shadow

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraPropinaApp()
        }
    }
}
    // Entrada del monto
    @Composable
    fun CalculadoraPropinaApp() {
        // Variables de estado
        var montoCuenta by remember{ mutableStateOf("") }
        var propina by remember{ mutableStateOf(0.0) }
        var porcentajeSeleccionado by remember{ mutableStateOf(0) }
        var mostrarAlerta by remember { mutableStateOf(false) }
        // Pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF989696))
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement= Arrangement.Center
        ) {
            //1.- Imagen agregada
            Image(painterResource(id = R.drawable.propinas),
            contentDescription = "Propinas",
                //2.- Agregamos borde a la imagen
                modifier = Modifier
                    //8 y 10.- Sombra y tamaño de la imagen
                    .size(150.dp)
                    .shadow(elevation = 10.dp, shape = RoundedCornerShape(8.dp))
                    .border(width = 10.dp, color = Color.Black,
                        shape = RoundedCornerShape(8.dp))
                )
            Spacer(modifier = Modifier.height(24.dp))
            //3.- Agregar linea que separe
            Divider(color = Color.Black)
            //4.- Agregar espacio
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Calculadora de Propinas",
                fontSize = 28.sp,
                //7.- Cambiar fuente
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF0D47A1)
            )

            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = montoCuenta,
                onValueChange = { montoCuenta = it },
                label = { Text("Monto de la cuenta") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(24.dp))
            // Botones de porcentaje
            Text(text = "Selecciona el porcentaje de propina:",
                //Cambiar texto
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                ","
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    if(montoCuenta.isNotBlank()){
                        porcentajeSeleccionado = 10
                        propina = calcularPropina(montoCuenta, 10)
                        mostrarAlerta = true
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor =
                        Color(0xFF42A5F5)
                )
            ) {
                Text("10%")
            }
            Button(
                onClick = {
                    if(montoCuenta.isNotBlank()){
                        porcentajeSeleccionado = 15
                        propina = calcularPropina(montoCuenta, 15)
                        mostrarAlerta = true
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor =
                        Color(0xFF1E88E5)
                )
            ) {
                Text("15%")
            }
            Button(
                onClick = {
                    if(montoCuenta.isNotBlank()){
                        porcentajeSeleccionado = 20
                        propina = calcularPropina(montoCuenta, 20)
                        mostrarAlerta = true
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor =
                        Color(0xFF1565C0)
                )
            ) {
                Text("20%")
            }
            Button(
                onClick = {
                    if(montoCuenta.isNotBlank()){
                        porcentajeSeleccionado = 25
                        propina = calcularPropina(montoCuenta, 25)
                        mostrarAlerta = true
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    //6.- Cambiar color del botón
                    containerColor = Color(0xFFA115C0)
                )
            ){
                Text("25%")
            }

            Spacer(modifier = Modifier.height(32.dp))
// Mostrar resultado
            if (propina > 0) {
                Text(
                    text = "Propina: $%.2f".format(propina),
                    fontSize = 22.sp,
                    color = Color(0xFF0D47A1),
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Total a pagar: $%.2f".format(
                        propina + (montoCuenta.toDoubleOrNull() ?: 0.0)
                    ), fontSize = 20.sp, color = Color.Black
                )
            }
            //5.- Mostrar alerta
            if(mostrarAlerta){
                AlertDialog(
                    onDismissRequest = {
                        mostrarAlerta = false
                    },
                    title = {
                        Text(text = "Calculo realizado",
                            //Cambiar color texto
                            color = Color.Blue)
                    },
                    text = {
                        Text(text = "Gracias por su propina!!!",
                            //9.- Cambiar color del texto
                            color = Color.Magenta)
                    },
                    confirmButton = {
                        Button(
                            onClick = {
                                mostrarAlerta = false
                            }
                        ) {
                            Text(text = "Aceptar")
                        }
                    }
                )
                    }
            }
        }
// Función para calcular propina
fun calcularPropina(monto: String, porcentaje: Int): Double {
    val montoDouble = monto.toDoubleOrNull() ?: 0.0
    return montoDouble * porcentaje / 100
}
@Preview(showBackground = true)
@Composable
fun CalculadoraPropinaAppPreview(){

}
