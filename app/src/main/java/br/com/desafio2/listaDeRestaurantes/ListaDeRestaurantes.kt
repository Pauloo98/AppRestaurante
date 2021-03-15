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
        listaDeRestaurante.add(Restaurantes("Paris 6", "Av. Faria Lima, 1925 - Pinheiros/SP", "Fecha as 12:00", R.drawable.camarao))
        listaDeRestaurante.add(Restaurantes("Rei da Pamonha", "Rua Silvio Roberto, 10 - Vila Olimpia/SP", "Abre as 13:30", R.drawable.ayoama))
        listaDeRestaurante.add(Restaurantes("Madeiro", "Av. do Estado, 1554 - Armenia/SP", "Fecha as 23:00", R.drawable.sisenor))
        return listaDeRestaurante
    }

    fun cliqueRestaurante(){
        val intent = Intent(this, DetalheDoPrato::class.java)
        startActivity(intent)
    }

}