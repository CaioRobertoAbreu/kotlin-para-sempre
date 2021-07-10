package com.kotlin.app4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var botao: Button
    private lateinit var resView: TextView
    private var priceGas: Double = 0.0
    private var priceAlcool: Double = 0.0
    private var res: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.button)
        botao.setOnClickListener{
            priceGas = findViewById<EditText>(R.id.gas_input).text.toString().toDouble()
            priceAlcool = findViewById<EditText>(R.id.alcool_input).text.toString().toDouble()
            resView = findViewById(R.id.answer)

            res = priceAlcool / priceGas

            when {
                res < 0.7 ->  resView.text = "Alcool é mais vantajoso"
                res == 0.7 ->  resView.text = "Alcool e gasolina tem o mesmo valor"
                res > 0.7 ->  resView.text = "Gasolina é mais vantajosa"
            }
        }
    }
}