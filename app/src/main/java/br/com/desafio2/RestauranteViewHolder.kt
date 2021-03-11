package br.com.desafio2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestauranteViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val nomeDoRestaurante by lazy { itemView.findViewById<TextView>(R.id.nomeDoRestaurante) }
    val enderecoDoRestaurante by lazy { itemView.findViewById<TextView>(R.id.enderecoDoRestaurante) }
    val horarioDeFuncionamento by lazy { itemView.findViewById<TextView>(R.id.horaDeFuncionamento) }




}