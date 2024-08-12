package com.example.labtest02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val btnNavigateSignUp: Button = findViewById(R.id.btn_sign_up)
        btnNavigateSignUp.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val btnNavigateSignIn: Button = findViewById(R.id.btn_login)
        btnNavigateSignIn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}