package br.com.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.desafio2.listaDeRestaurantes.ListaDeRestaurantes
import br.com.desafio2.login.Registrarse

class MainActivity : AppCompatActivity() {


    val login by lazy { findViewById<Button>(R.id.login) }
    val registrar by lazy { findViewById<Button>(R.id.registrar) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registrar.setOnClickListener {
            botaoRegistrar()
        }

        login.setOnClickListener {
            botaoLogin()
        }


    }


    fun botaoRegistrar() {

        val intent = Intent(this, Registrarse::class.java)
        startActivity(intent)

    }

    fun botaoLogin(){

        val intent = Intent(this, ListaDeRestaurantes::class.java)
        startActivity(intent)
    }

}