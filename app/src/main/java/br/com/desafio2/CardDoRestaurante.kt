package br.com.desafio2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CardDoRestaurante : AppCompatActivity() {

    val nomeDoRestaurante by lazy { findViewById<TextView>(R.id.nomeDoRestaurante) }
    val enderecoDoRestaurante by lazy { findViewById<TextView>(R.id.enderecoDoRestaurante) }
    val horaDeFuncionamento by lazy { findViewById<TextView>(R.id.horaDeFuncionamento) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_do_restaurante)
    }

}