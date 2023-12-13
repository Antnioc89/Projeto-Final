package com.example.aplicativoch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val button2 = findViewById<Button>(R.id.button3)
        val buttonvideo = findViewById<Button>(R.id.buttonvideo)

        button2.setOnClickListener{

            Treescreen()

        }
        buttonvideo.setOnClickListener{

            Videoscreen()

        }


    }

    private fun Treescreen() {
        val PushButton2 = Intent(this, MainActivity2::class.java)
        startActivity(PushButton2)
    }
    private fun Videoscreen() {
        val PushButtonVideo = Intent(this, VideoActivity::class.java)
        startActivity(PushButtonVideo)
    }
}