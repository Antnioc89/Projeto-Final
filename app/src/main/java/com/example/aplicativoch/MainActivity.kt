package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            Thirdscreen()

        }


    }

    private fun Thirdscreen() {
        val PushButton2 = Intent(this, IntroActivity::class.java)
        startActivity(PushButton2)
    }
}