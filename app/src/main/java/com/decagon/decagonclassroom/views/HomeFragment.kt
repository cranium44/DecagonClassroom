package com.decagon.decagonclassroom.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.views.adapters.ArticleAdapter

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var articleAdapter: ArticleAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        articleAdapter =
            ArticleAdapter()
        layoutManager = LinearLayoutManager(this.activity!!.applicationContext)
        recyclerView = view.findViewById(R.id.recyclerViewArticles)
        recyclerView.adapter = articleAdapter
        recyclerView.layoutManager = layoutManager
        return view
    }


}
