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
class ArticlesFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_articles, container, false)
        recyclerView = view.findViewById(R.id.articles_recycler)
        recyclerView.adapter = ArticleAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this.activity!!.baseContext)
        return view
    }


}
