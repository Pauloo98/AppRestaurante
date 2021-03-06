package br.com.desafio2.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler

import androidx.appcompat.app.AppCompatActivity
import br.com.desafio2.MainActivity
import br.com.desafio2.R

class SplashActivity : AppCompatActivity () {

    // This is the loading time of the splash screen
    private val SPLASH_TIME_OUT:Long = 30 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this, MainActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}