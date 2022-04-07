package com.reyy.recyclerviewkotlinreyy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  BadmintonAdapter (private val context: Context, private val badminton: List<Badminton>, val listener: (Badminton) ->Unit)
    : RecyclerView.Adapter<BadmintonAdapter.BadmintonViewHolder>(){
    class BadmintonViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgBadminton = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBadminton = view.findViewById<TextView>(R.id.tv_item_name)
        val descBadminton = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(badminton: Badminton, listener: (Badminton) -> Unit) {
            imgBadminton.setImageResource(badminton.imgBadminton)
            nameBadminton.text = badminton.nameBadminton
            descBadminton.text = badminton.descBadminton
            itemView.setOnClickListener {
                listener(badminton)
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BadmintonViewHolder {
        return BadmintonViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_badminton, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BadmintonViewHolder, position: Int) {
       holder.bindView(badminton[position],listener)
    }

    override fun getItemCount(): Int = badminton.size
    }
