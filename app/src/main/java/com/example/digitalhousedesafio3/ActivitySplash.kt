package com.example.digitalhousedesafio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class ActivitySplash : AppCompatActivity() {

    val splashScreenTime: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ActivityLogin::class.java))
            finish()
        }, splashScreenTime)
    }
}