package br.com.desafio2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdapter(private val restauranteList : MutableList<Restaurantes>) : RecyclerView.Adapter<RestauranteViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_do_restaurante, parent, false)
        return RestauranteViewHolder(view)
    }


    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val nomeDoRestaurante = holder.nomeDoRestaurante
        val enderecoDoRestaurante = holder.enderecoDoRestaurante
        val horaDeFuncionamento = holder.horarioDeFuncionamento
        nomeDoRestaurante.text = restauranteList[position].nome
        enderecoDoRestaurante.text = restauranteList[position].endereco
        horaDeFuncionamento.text = restauranteList[position].horario

    }

    override fun getItemCount(): Int = restauranteList.size


}