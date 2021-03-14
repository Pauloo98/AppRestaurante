package br.com.desafio2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.desafio2.R

class RestauranteViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val nomeDoRestaurante by lazy { itemView.findViewById<TextView>(R.id.nomeDoRestaurante) }
    val enderecoDoRestaurante by lazy { itemView.findViewById<TextView>(R.id.enderecoDoRestaurante) }
    val horarioDeFuncionamento by lazy { itemView.findViewById<TextView>(R.id.horaDeFuncionamento) }
    val imgCardDoRestaurante by lazy { itemView.findViewById<ImageView>(R.id.imgCardDoRestaurante) }





}