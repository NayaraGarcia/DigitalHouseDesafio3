package com.example.digitalhousedesafio3.activity.activity.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.digitalhousedesafio3.R

class ActivitySplash : AppCompatActivity() {

    private val splashScreenTime : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ActivityLogin::class.java))
            finish()
        }, splashScreenTime)

    }
}