package com.kotlin.app5

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var foto: ImageView
    private lateinit var botaoTirarFoto : Button
    private lateinit var nome : EditText
    private lateinit var idade : EditText
    private lateinit var botaoSalvar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foto = findViewById(R.id.imgFoto)
        botaoTirarFoto = findViewById(R.id.btnFoto)
        nome = findViewById(R.id.edtNome)
        idade = findViewById(R.id.edtIdade)
        botaoSalvar = findViewById(R.id.btnSalvar)

        botaoSalvar.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            val usuario = User(nome = nome.text.toString(), idade = idade.text.toString().toInt())
            intent.putExtra("USUARIO", usuario)

            startActivity(intent)
        }

        botaoTirarFoto.setOnClickListener {
            abrirCamera()
        }
    }

    private fun abrirCamera(){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if(intent.resolveActivity(packageManager) != null){
            startActivityForResult(intent, 12345)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 12345 && resultCode == RESULT_OK){
            val fotoTirada = data?.extras?.get("data") as Bitmap
            foto.setImageBitmap(fotoTirada)
        }
    }

    override fun onBackPressed() {
        val dialog = AlertDialog.Builder(this@MainActivity)
        dialog.setTitle("Confirmação")
        dialog.setPositiveButton("Sim", DialogInterface.OnClickListener{ _, _ ->  super.onBackPressed()})
        dialog.create().show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("CICLO DE VIDA", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLO DE VIDA", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO DE VIDA", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLO DE VIDA", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO DE VIDA", "OnDestroy")
    }
}