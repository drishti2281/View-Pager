package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.FragmentFirstViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
  //  private lateinit var binding: FragmentFirstViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = FragmentFirstViewPagerBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //binding.apply {

           // PagerView.adapter = OnboardingAdapter()
           // TabLayoutMediator(
              //  intoTabLayout,
               // PagerView
          //  ) { tab, position -> }.attach() //The Magical Line

       // }
    }
}