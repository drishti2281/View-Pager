package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class Recyclerview(var layouts: ArrayList<Int>) : RecyclerView.Adapter<Recyclerview.ViewHolder>() {
    class ViewHolder(var view : View): RecyclerView.ViewHolder(view) {}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        return layouts[position]
    }
    override fun onBindViewHolder(holder: Recyclerview.ViewHolder, position: Int) {

    }
    override fun getItemCount() = layouts.size
}
