package com.example.viewpager

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.databinding.FragmentFirstViewPagerBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstViewPagerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var layouts = arrayListOf(
        R.layout.layout_pager_view1,
        R.layout.layout_pager_view2,
        R.layout.layout_pager_view3,
        R.layout.layout_pager_view4,
        R.layout.layout_pager_view5
    )
    var recyclerAdapter = Recyclerview(layouts)
    lateinit var binding: FragmentFirstViewPagerBinding
    private val TAG = "FirstViewPagerFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstViewPagerBinding.inflate(layoutInflater)

        binding.PagerView.adapter = recyclerAdapter

        binding.PagerView.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    Log.e(TAG, "position $position")
                }
            }
        )
    return binding.root
}
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstViewPagerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                FirstViewPagerFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}