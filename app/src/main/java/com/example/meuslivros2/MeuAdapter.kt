package com.example.meuslivros2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val livrosList : ArrayList<Livro> ): RecyclerView.Adapter<MeuAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.livros_item,
        parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = livrosList[position]

        holder.nameLivro.text = currentitem.nomeLivro
        holder.nameAutor.text = currentitem.nomeAutor
        holder.nameEditora.text = currentitem.editora
    }

    override fun getItemCount(): Int {
        return livrosList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val nameLivro : TextView = itemView.findViewById(R.id.tvNomeLivro)
        val nameAutor : TextView = itemView.findViewById(R.id.tvNomeAutor)
        val nameEditora : TextView = itemView.findViewById(R.id.tvNomeEditora)

    }
}