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
import kotlinx.android.synthetic.main.fragment_resources.*

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
        viewPager.adapter = PagerAdapter(fragmentManager!!, 3)
        viewPager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                resource_tab_layout
            )
        )
        return view
    }

}
