package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    var layout = arrayListOf(R.layout.layout_pager_view1,
        R.layout.layout_pager_view2,
        R.layout.layout_pager_view3,
        R.layout.layout_pager_view4,
        R.layout.layout_pager_view5)
    var adapter = Recyclerview(layout)
    var dotsRecycler = DotsRecycler(layout.size)
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvRecyclerview.adapter = dotsRecycler

        binding.Mainviewpager.adapter = adapter
        binding.Mainviewpager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)

                    dotsRecycler.updatePosition(position)
                    if (position==0){
                        binding.tvSkipBar.visibility = View.INVISIBLE
                        binding.tvDonebar.visibility = View.INVISIBLE

                    }else if (position==1){
                        binding.tvSkipBar.visibility = View.VISIBLE
                        binding.tvDonebar.visibility = View.INVISIBLE

                    }else if (position==2){
                        binding.tvSkipBar.visibility = View.VISIBLE
                        binding.tvDonebar.visibility = View.INVISIBLE

                    }else if (position==3){
                        binding.tvSkipBar.visibility = View.VISIBLE
                        binding.tvDonebar.visibility = View.INVISIBLE

                    }else{
                        binding.tvSkipBar.visibility = View.INVISIBLE
                        binding.tvDonebar.visibility = View.VISIBLE

                    }
                    Log.e(TAG, "position $position")

                }

            }
        )
        binding.tvSkipBar.setOnClickListener {
            val lastPosition = layout.size - 1
            binding.Mainviewpager.currentItem = lastPosition
        }
    }
}