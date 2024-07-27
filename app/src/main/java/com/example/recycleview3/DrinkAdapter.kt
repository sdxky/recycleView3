package com.example.recycleview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DrinkAdapter(private val drinkList: List<Drink>) : RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder>() {

    class DrinkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val drinkName: TextView = itemView.findViewById(R.id.drink_name)
        val drinkDescription: TextView = itemView.findViewById(R.id.drink_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_drink, parent, false)
        return DrinkViewHolder(view)
    }

    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {
        val drink = drinkList[position]
        holder.drinkName.text = drink.name
        holder.drinkDescription.text = drink.description
    }

    override fun getItemCount() = drinkList.size
}
