package com.example.aplicativoch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indus)
        val button2 = findViewById<Button>(R.id.button11)

        button2.setOnClickListener{

            Indusscreen()

        }


    }

    private fun Indusscreen() {
        val PushButtonIndus = Intent(this, MainActivity2::class.java)
        startActivity(PushButtonIndus)

    }
}