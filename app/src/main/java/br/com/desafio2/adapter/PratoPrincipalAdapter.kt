package br.com.desafio2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.desafio2.R

class PratoPrincipalAdapter(val context: Context, val nomeDoPrato: ArrayList<String>, val imagemDoPrato: IntArray) : BaseAdapter(){

    private var layoutInflater: LayoutInflater? = null
    private lateinit var nomeDoPratoPrincipal : TextView
    private lateinit var imagemDoPratoPrincipal : ImageView


    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int = nomeDoPrato.size

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.lista_de_pratos, null)
        }
        imagemDoPratoPrincipal = convertView!!.findViewById<ImageView>(R.id.imagemDoPratoPrincipal)
//        imagemDoPratoPrincipal = imagemDoPrato[position]
        imagemDoPratoPrincipal.setBackgroundResource(imagemDoPrato[position])
//        imagemDoPratoPrincipal.background
        nomeDoPratoPrincipal = convertView.findViewById<TextView>(R.id.nomeDoPratoPrincipal)
        nomeDoPratoPrincipal.text = nomeDoPrato[position]
        return convertView
    }


}