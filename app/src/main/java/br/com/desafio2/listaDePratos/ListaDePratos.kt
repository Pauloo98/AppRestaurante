package br.com.desafio2.listaDePratos

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.desafio2.R
import br.com.desafio2.adapter.PratoPrincipalAdapter
import br.com.desafio2.listaDeRestaurantes.ListaDeRestaurantes
import br.com.desafio2.model.PratoPrincipal
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaDePratos : AppCompatActivity() {


    val gridView by lazy { findViewById<GridView>(R.id.gridViewPratosPrincipais) }
    val nomesDosPratos = arrayListOf<String>("Buchada", "feijoada", "lasanha", "arroz", "peixe")
    val imagensDosPratos = intArrayOf(
        R.drawable.camarao,
        R.drawable.ayoama,
        R.drawable.camarao,
        R.drawable.camarao,
        R.drawable.camarao
    )
    val fabVoltarListaDePratos by lazy { findViewById<FloatingActionButton>(R.id.fabVoltaDetalheDoRestaurante) }
    val imgCapaDoRestaurante by lazy {findViewById<ImageView>(R.id.imagemDoRestaurante)}
    val detalheNomeDoRestaurante by lazy { findViewById<TextView>(R.id.detalheNomeDoRestaurante)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_do_restaurante)


        val adapter = PratoPrincipalAdapter(this@ListaDePratos, nomesDosPratos, imagensDosPratos)
        gridView.adapter = adapter


//        val pratosprincipais = getPratoPrincipal()

        gridView.setOnItemClickListener { parent, view, position, id ->
                val intent = Intent(this, DetalheDoPrato::class.java)
                intent.putExtra("nomeDoPrato", nomesDosPratos[position])
                startActivity(intent)
        }

        fabVoltarListaDePratos.setOnClickListener {
            val intent = Intent(this, ListaDeRestaurantes::class.java)
            startActivity(intent)
        }

        imgCapaDoRestaurante.setBackgroundResource(imagensDosPratos[0])
        val dados = intent.extras
        val nomeDoRestauranteClicado = dados?.getString("nomeDoRestaurante")
        detalheNomeDoRestaurante.text = nomeDoRestauranteClicado









    }


}