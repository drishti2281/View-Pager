package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DotsRecycler(var count: Int) : RecyclerView.Adapter<DotsRecycler.ViewHolder>() {
    var selectedPosition = 0
    class ViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var ivDot = view.findViewById<ImageView>(R.id.ivitemDots)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.items_icon, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(position == selectedPosition)
            holder.ivDot.setBackgroundResource(R.drawable.selected_dot)
        else
            holder.ivDot.setBackgroundResource(R.drawable.default_dot)
    }

    fun updatePosition(position: Int) {
        this.selectedPosition = position
        notifyDataSetChanged()
    }
}