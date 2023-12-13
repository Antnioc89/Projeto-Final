package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IceActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ice)
        val button2 = findViewById<Button>(R.id.button9)
        val button3 = findViewById<Button>(R.id.button19)
        button2.setOnClickListener{

            Icescreen()

        }

        button3.setOnClickListener{

            Intialscreen()

        }


    }

    private fun Icescreen() {
        val PushButtonIce = Intent(this, IceActivity2::class.java)
        startActivity(PushButtonIce)
    }
    private fun Intialscreen() {
        val PushButton = Intent(this, MainActivity2::class.java)
        startActivity(PushButton)
    }
}