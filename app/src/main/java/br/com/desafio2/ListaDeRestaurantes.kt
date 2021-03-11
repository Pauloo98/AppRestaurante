package br.com.desafio2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
        listaDeRestaurante.add(Restaurantes("RESTAURANTE DO PAULO UM", "RUA JOAO", "MEIO DIA"))
        listaDeRestaurante.add(Restaurantes("RESTAURANTE DA JULIANA", "AVENIDA MARIA", "DOZE HORAS"))
        listaDeRestaurante.add(Restaurantes("RESTAURANTE 3", "ENDEREÇO 3", "HORA 3"))

        return listaDeRestaurante
    }

}