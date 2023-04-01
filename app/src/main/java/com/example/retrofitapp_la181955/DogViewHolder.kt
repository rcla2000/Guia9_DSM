package com.example.retrofitapp_la181955

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.example.retrofitapp_la181955.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
    private val itemDogBinding: ItemDogBinding

    init {
        itemDogBinding = ItemDogBinding.bind(view!!)
    }

    fun bind(imageUrl: String?) {
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog)
    }
}