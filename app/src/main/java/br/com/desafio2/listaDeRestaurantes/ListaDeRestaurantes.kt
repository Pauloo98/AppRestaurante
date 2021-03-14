package br.com.desafio2.listaDeRestaurantes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.desafio2.R
import br.com.desafio2.adapter.RestauranteAdapter
import br.com.desafio2.listaDePratos.DetalheDoPrato
import br.com.desafio2.model.Restaurantes

class ListaDeRestaurantes : AppCompatActivity() {


    val recycler by lazy { findViewById<RecyclerView>(R.id.recycleRestaurantes) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_de_restaurantes)

        val restaurantes = getRestaurantes()

        recycler.layoutManager = LinearLayoutManager(this)
        val adapter  = RestauranteAdapter(restaurantes)
        recycler.adapter = adapter


    }

    private fun getRestaurantes() : MutableList<Restaurantes> {
        val listaDeRestaurante = mutableListOf<Restaurantes>()
        listaDeRestaurante.add(Restaurantes("RESTAURANTE DO PAULO", "RUA JOAO", "12:00", R.drawable.camarao))
        listaDeRestaurante.add(Restaurantes("RESTAURANTE DA JULIANA", "AVENIDA MARIA", "13:30", R.drawable.ayoama))
        listaDeRestaurante.add(Restaurantes("RESTAURANTE DO MANOEL", "AV. DO ESTADO", "23:00", R.drawable.sisenor))
        return listaDeRestaurante
    }

    fun cliqueRestaurante(){
        val intent = Intent(this, DetalheDoPrato::class.java)
        startActivity(intent)
    }

}