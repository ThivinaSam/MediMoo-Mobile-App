package com.example.labtest02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class OnBoardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)

        Handler().postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }, 3000)

//        val btnNavigateSearch: Button = findViewById(R.id.btnSearch)
//        btnNavigateSearch.setOnClickListener {
//            val intent = Intent(this, Search::class.java)
//            startActivity(intent)
//        }
//        val btnNavigateStats: Button = findViewById(R.id.btnStats)
//        btnNavigateStats.setOnClickListener {
//            val intent = Intent(this, Stats::class.java)
//            startActivity(intent)
//        }
//        val btnNavigateProfile: Button = findViewById(R.id.btnProfile)
//        btnNavigateProfile.setOnClickListener {
//            val intent = Intent(this, Profile::class.java)
//            startActivity(intent)
//        }
    }
}