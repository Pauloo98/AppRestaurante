package br.com.desafio2.adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.desafio2.R
import br.com.desafio2.listaDePratos.ListaDePratos
import br.com.desafio2.listaDeRestaurantes.ListaDeRestaurantes
import br.com.desafio2.login.Registrarse
import br.com.desafio2.model.PratoPrincipal
import br.com.desafio2.model.Restaurantes
import kotlinx.android.synthetic.main.lista_de_pratos.view.*
import kotlinx.android.synthetic.main.splash.view.*

class RestauranteAdapter(val restauranteList: MutableList<Restaurantes>) :
    RecyclerView.Adapter<RestauranteViewHolder>() {


    override fun getItemCount(): Int = restauranteList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_do_restaurante, parent, false)
        return RestauranteViewHolder(view)
    }


    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val imagem = holder.imgCardDoRestaurante
        val nomeDoRestaurante = holder.nomeDoRestaurante
        val enderecoDoRestaurante = holder.enderecoDoRestaurante
        val horaDeFuncionamento = holder.horarioDeFuncionamento

        imagem.setBackgroundResource(restauranteList[position].imagem)
        nomeDoRestaurante.text = restauranteList[position].nome
        enderecoDoRestaurante.text = restauranteList[position].endereco
        horaDeFuncionamento.text = restauranteList[position].horario




        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, ListaDePratos::class.java)
            intent.putExtra("nomeDoRestaurante", nomeDoRestaurante.text.toString())
            intent.putExtra("posicao", position)
            intent.putExtra("imagemDoPrato", restauranteList[position].imagem.toString())
            it.context.startActivity(intent)

        }



    }


}


