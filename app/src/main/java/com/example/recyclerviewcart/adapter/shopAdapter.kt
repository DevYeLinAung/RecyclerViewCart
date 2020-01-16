package com.example.recyclerviewcart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcart.R
import com.example.recyclerviewcart.model.Shop
import kotlinx.android.synthetic.main.shop_item.view.*

class ShopsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var shopImage = itemView.findViewById<ImageView>(R.id.shop_image)
    var shopName = itemView.findViewById<TextView>(R.id.shop_name)
    var shopPrice = itemView.findViewById<TextView>(R.id.shop_price_p)

}

class shopAdapter(val shopList: ArrayList<Shop>) : RecyclerView.Adapter<ShopsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shop_item, parent, false)
        return ShopsViewHolder(view)

    }

    override fun getItemCount(): Int {
        return shopList.size

    }

    override fun onBindViewHolder(holder: ShopsViewHolder, position: Int) {
        holder.shopImage.setImageResource(shopList[position].image)
        holder.shopName.text =shopList[position].name
        holder.shopPrice.text=shopList[position].price

    }

}
