package com.decagon.decagonclassroom.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.decagon.decagonclassroom.R

/**
 * A simple [Fragment] subclass.
 */
class ResourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resources, container, false)
//        var tabview = view.findViewById<TabHost>(R.id.tabView)
        return view
    }

}
