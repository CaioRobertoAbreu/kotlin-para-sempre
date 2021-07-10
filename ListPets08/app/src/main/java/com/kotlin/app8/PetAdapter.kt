package com.kotlin.app8

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PetAdapter(var listaPet: MutableList<Pet>):RecyclerView.Adapter<PetAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgFoto: ImageView = view.findViewById(R.id.imgFoto)
        val txtNome: TextView = view.findViewById(R.id.txtNome)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pet, parent, false)
        return ItemViewHolder(view)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        listaPet[position].foto?.let{
            holder.imgFoto.setImageDrawable(it)
        }
        holder.txtNome.text = listaPet[position].nome

    }

    override fun getItemCount(): Int {
        return listaPet.size
    }
}
