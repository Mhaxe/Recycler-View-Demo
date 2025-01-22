package com.tutorials.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {

    val fruitList = listOf("pope","panda","pear","Mango","orange","apple","Banana","Lemon")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list,parent,false)
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.myTextView.text = fruit
    }

}

class MyViewHolder(val view:View) : RecyclerView.ViewHolder(view) {
    val myTextView = view.findViewById<TextView>(R.id.tvName)
}