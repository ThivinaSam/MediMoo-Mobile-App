package com.example.labtest02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Stats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stats)

        val btnNavigateHome: Button = findViewById(R.id.btnHome)
        btnNavigateHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val btnNavigateSearch: Button = findViewById(R.id.btnSearch)
        btnNavigateSearch.setOnClickListener {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }
        val btnNavigateProfile: Button = findViewById(R.id.btnProfile)
        btnNavigateProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}