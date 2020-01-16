package com.example.recyclerviewcart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcart.adapter.shopAdapter
import com.example.recyclerviewcart.model.Shop

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.shop_recycler)
        val shopArray = ArrayList<Shop>()
        shopArray.add(Shop(R.drawable.sugar, "Fine Grain Sugar", "$20"))
        shopArray.add(Shop(R.drawable.peanut, "Peanuts", "$280  "))
        shopArray.add(Shop(R.drawable.rice, "Rice", "$290"))

        val shopAdapter = shopAdapter(shopArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = shopAdapter
    }
}
