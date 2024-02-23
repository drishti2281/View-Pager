package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.FragmentFirstViewPagerBinding

class Recyclerview(var layouts: ArrayList<Int>) : RecyclerView.Adapter<Recyclerview.ViewHolder>() {
    class ViewHolder(var view : View): RecyclerView.ViewHolder(view) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
//        return super.getItemViewType(position)
        return layouts[position]
    }

    override fun getItemCount() = layouts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

}
//class OnboardingAdapter() : RecyclerView.Adapter<OnboardingAdapter.ViewHolder>() {
  //  class ViewHolder(val binding: FragmentFirstViewPagerBinding) : RecyclerView.ViewHolder(binding.root) {

    //}

   // override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
       // FragmentFirstViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    //)

    //override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      //  with(holder) {
        //    binding.apply {
          //      //Bind views with some data here
            //}
        //}
    //}

    //override fun getItemCount() = 5
//}

