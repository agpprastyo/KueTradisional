package com.example.kuetradisional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val SPLASH_DISPLAY_LENGTH = 1000


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val mainIntent = Intent(this, MainActivity::class.java)
            this.startActivity(mainIntent)
            this.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}