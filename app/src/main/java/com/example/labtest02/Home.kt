package com.example.labtest02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.home)

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
        val btnNavigateProfile: Button = findViewById(R.id.btnProfile)
        btnNavigateProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}