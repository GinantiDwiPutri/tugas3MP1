package com.ginanti.ginantilodge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        val btn_back = findViewById<Button>(R.id.btn_profile)

        btn_back.setOnClickListener {
            val backIntent = Intent(this@ProfileActivity2, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}