package com.example.loginapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapp.R
import android.content.Intent
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoutBtn: Button = findViewById(R.id.logoutBtn)
        logoutBtn.setOnClickListener {
            val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", false)
            editor.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}