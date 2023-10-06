package com.example.p4_31_b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sign = findViewById<Button>(R.id.signbt)
        sign.setOnClickListener {
            val intent = Intent(this, activity_registration::class.java)
            startActivity(intent)
        }
        val login = findViewById<Button>(R.id.logbt)
        login.setOnClickListener {
            val intent = Intent(this, activity_login::class.java)
            startActivity(intent)
        }
    }
}