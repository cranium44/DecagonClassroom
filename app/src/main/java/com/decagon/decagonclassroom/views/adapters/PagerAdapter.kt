package com.decagon.decagonclassroom.views.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.decagon.decagonclassroom.views.ArticlesFragment
import com.decagon.decagonclassroom.views.BooksFragment
import com.decagon.decagonclassroom.views.VideosFragment

class PagerAdapter(var fragmentManager: FragmentManager, var numOfTabs: Int) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val fragment = when (position) {
            0 -> ArticlesFragment()
            1 -> BooksFragment()
            2 -> VideosFragment()
            else -> null
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return numOfTabs
    }
}