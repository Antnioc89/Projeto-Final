package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FireActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire)
        val button2 = findViewById<Button>(R.id.button7) // Declaração do botão
        val button3 = findViewById<Button>(R.id.button17)
        button2.setOnClickListener{ // Chama a Variavel

            Firescreen()
        }
        button3.setOnClickListener{

            Intitialscreen()
        }

    }

    private fun Firescreen() {
        val PushButtonFire = Intent(this, FireActivity2::class.java) // A variavel intent que da o comando para a proxima pagina
        startActivity(PushButtonFire)

    }

    private fun Intitialscreen() {
        val PushButtonFire2 = Intent(this, MainActivity2::class.java)
        startActivity(PushButtonFire2)

    }
}