package com.example.higherlowercardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startButton)

        button.setOnClickListener {
            handleButtonPress()
        }
    }

    fun handleButtonPress(){
        Log.d("!!!", "Start knappen har tryckts")
        val intent = Intent(this, CardActivity::class.java)
        startActivity(intent)
    }
}