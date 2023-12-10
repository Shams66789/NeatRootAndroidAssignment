package com.example.ui_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val textView = findViewById<Button>(R.id.button)

        textView.setOnClickListener() {
            intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}