package com.example.kuetradisional

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardviewKueAdapter(
    private val listKue: ArrayList<MacamKue>) :
    RecyclerView.Adapter<CardviewKueAdapter.CardViewKueHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class CardViewKueHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewKueHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_kue, parent, false)
        return CardViewKueHolder(view)
    }


    override fun onBindViewHolder(holder: CardViewKueHolder, position: Int) {
        val kue: MacamKue = listKue[position]

        Glide.with(holder.itemView.context)
            .load(kue.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgPhoto)

        holder.tvName.text = kue.name
        holder.tvDetail.text = kue.detail

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listKue[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listKue.size
    }
    fun setOnItemClickCallback(callback: OnItemClickCallback){
        this.onItemClickCallback = callback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: MacamKue)
    }
}