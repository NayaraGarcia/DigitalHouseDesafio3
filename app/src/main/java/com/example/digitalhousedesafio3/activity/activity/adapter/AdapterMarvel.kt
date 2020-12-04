package com.example.digitalhousedesafio3.activity.activity.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousedesafio3.R
import kotlinx.android.synthetic.main.capa.view.*

 class AdapterMarvel : RecyclerView.Adapter<AdapterMarvel.ComicViewHolder>() {

    class ComicViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val ivCapa : ImageView = view.ivCapa
        val tvNumero : TextView = view.tvNumero
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.capa, parent, false)
         return ComicViewHolder(view)
     }

     override fun getItemCount(): Int {
         TODO("Not yet implemented")
     }

     override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
         TODO("Not yet implemented")
     }
 }
