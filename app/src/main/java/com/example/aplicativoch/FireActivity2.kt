package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FireActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire2)
        val button3 = findViewById<Button>(R.id.button8)

        button3.setOnClickListener{

            Firescreen2()

        }


    }

    private fun Firescreen2() {
        val PushButtonFire2 = Intent(this, FireActivity::class.java)
        startActivity(PushButtonFire2)
    }
}