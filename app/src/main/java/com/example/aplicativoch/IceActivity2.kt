package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IceActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ice2)
        val button2 = findViewById<Button>(R.id.button10)

        button2.setOnClickListener{

            Icescreen2()

        }


    }

    private fun Icescreen2() {
        val PushButtonIce2 = Intent(this, IceActivity::class.java)
        startActivity(PushButtonIce2)
    }
}