package com.example.prueba1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Definir etiquetas
            val txtnumero1 = findViewById<EditText>(R.id.txtNumero1)
            val txtnumero2 = findViewById<EditText>(R.id.txtNumero2)
            val btnSuma = findViewById<Button>(R.id.btnSuma)
            val btnResta = findViewById<Button>(R.id.btnResta)
            val btnProducto = findViewById<Button>(R.id.btnProducto)
            val btnDivision = findViewById<Button>(R.id.btnDivision)
            val lblResultado = findViewById<TextView>(R.id.lblResultado)
        //Definir eventos
        btnSuma.setOnClickListener {
            val numero1 = txtnumero1.text.toString().toDouble()
            val numero2 = txtnumero2.text.toString().toDouble()
            val resultado = numero1 + numero2
            lblResultado.text = resultado.toString()
        }
        btnResta.setOnClickListener {
            val numero1 = txtnumero1.text.toString().toDouble()
            val numero2 = txtnumero2.text.toString().toDouble()
            val resultado = numero1 - numero2
            lblResultado.text = resultado.toString()
        }
        btnProducto.setOnClickListener {
            val num1 = txtnumero1.text.toString().toDouble()
            val num2 = txtnumero2.text.toString().toDouble()
            val resultado = num1 * num2
            lblResultado.text = resultado.toString()
        }
        btnDivision.setOnClickListener {
            val num1 = txtnumero1.text.toString().toDouble()
            val num2 = txtnumero2.text.toString().toDouble()
            val res = num1 / num2
            lblResultado.text = res.toString()
        }
    }
}