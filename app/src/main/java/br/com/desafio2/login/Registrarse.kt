package br.com.desafio2.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.desafio2.MainActivity
import br.com.desafio2.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Registrarse : AppCompatActivity() {

    val voltarRegistrese by lazy { findViewById<FloatingActionButton>(R.id.voltarRegistre) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        voltarRegistrese.setOnClickListener {
            voltarRegistrese()
        }

    }



    fun voltarRegistrese(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}