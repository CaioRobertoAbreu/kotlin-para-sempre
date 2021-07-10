package com.kotlin.app5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.kotlin.app5.User

class SecondActivity : AppCompatActivity() {
    private lateinit var textgrid: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textgrid = findViewById(R.id.txtGrid)

        val usuario = intent.extras?.get("USUÁRIO") as User

        listaUsuario.add(usuario)

        textgrid.text = listaUsuario.toString()

        Toast.makeText(this, usuario.nome, Toast.LENGTH_LONG).show()
    }

    companion object{
        val listaUsuario = mutableListOf<User>()
    }
}