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
        val button2 = findViewById<Button>(R.id.ruleButton)

        button.setOnClickListener {
            handleButtonPress()
        }
        button2.setOnClickListener {
            val intent = Intent(this, RuleActivity::class.java)
            startActivity(intent)
        }
    }

    fun handleButtonPress(){
        val intent = Intent(this, CardActivity::class.java)
        startActivity(intent)
    }







}