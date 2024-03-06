package com.example.loginapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapp.R
import android.content.Intent
import android.widget.Button
import android.content.SharedPreferences
import com.example.loginapp.MainActivity

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