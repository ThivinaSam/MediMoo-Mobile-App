package com.example.labtest02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

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
        val btnNavigateStats: Button = findViewById(R.id.btnStats)
        btnNavigateStats.setOnClickListener {
            val intent = Intent(this, Stats::class.java)
            startActivity(intent)
        }
    }
}