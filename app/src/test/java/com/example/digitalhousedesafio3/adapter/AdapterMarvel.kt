package com.example.digitalhousedesafio3.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafiowebservice.activity.ComicActivity
import com.example.digitalhousedesafio3.R
import com.example.digitalhousedesafio3.domain.Marvel
import kotlinx.android.synthetic.main.capa.view.*

class AdapterMarvel : RecyclerView.Adapter< AdapterMarvel.ComicViewHolder>() {

     private val comics = arrayListOf<Marvel>()

     class ComicViewHolder(view : View) : RecyclerView.ViewHolder(view) {
         val ivComicCapa : ImageView = view.ivCapa
         val tvComicNumero : TextView = view.tvNumero
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.capa, parent, false)
         return ComicViewHolder(view)
     }

     override fun getItemCount() = comics.size

     override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
         val comic = comics[position]

         holder.tvComicNumero.text = "#${comic.id}"
         Glide.with(holder.ivComicCapa.context).asBitmap()
             .load(comic.images.first().toString())
             .into(holder.ivComicCapa)
         holder.ivComicCapa.setOnClickListener {
             val intent = Intent(it.context, ComicActivity::class.java)
             intent.putExtra("comic", comic)
             it.context.startActivity(intent)
         }
     }

     fun addComics(_comics: ArrayList<Marvel>) {
         comics.addAll(_comics)
         notifyDataSetChanged()
     }

 }
