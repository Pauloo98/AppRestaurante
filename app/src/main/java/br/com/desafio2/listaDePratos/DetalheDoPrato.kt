package br.com.desafio2.listaDePratos

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.desafio2.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.splash.view.*



class DetalheDoPrato() : AppCompatActivity() {

    val fabDetalheDoPrato by lazy { findViewById<FloatingActionButton>(R.id.voltarDetalheDoPrato) }
    val nomeDoPratoClicado by lazy { findViewById<TextView>(R.id.textView3) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_do_prato)


        fabDetalheDoPrato.setOnClickListener {
            super.onBackPressed()
        }

        val dados = intent.extras
        val nomeDoPrato = dados?.getString("nomeDoPrato")
        nomeDoPratoClicado.text = nomeDoPrato

    }
    


}