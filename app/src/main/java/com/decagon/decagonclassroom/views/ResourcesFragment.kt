package com.decagon.decagonclassroom.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.views.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout

/**
 * A simple [Fragment] subclass.
 */
class ResourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resources, container, false)
        val viewPager = view.findViewById<ViewPager>(R.id.frag_view_pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.resource_tab_layout)
        viewPager.adapter = PagerAdapter(fragmentManager!!, tabLayout.tabCount)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem = p0!!.position
//                when(p0!!.position){
//                    0 -> article_tab_item.isSelected = true
//                    1 ->
//                }
            }

        })
        viewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                tabLayout
            )
        )
        return view
    }

}
