package com.example.profileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnProfile = findViewById<Button>(R.id.txtButton)
        btnProfile.setOnClickListener{

         var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}