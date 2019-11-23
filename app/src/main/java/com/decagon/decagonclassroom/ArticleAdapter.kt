package com.decagon.decagonclassroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
//    var data = ArrayList<>()

    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var articleDate: TextView = view.findViewById(R.id.article_date)
        var articleTitle: TextView = view.findViewById(R.id.article_title)
        var articleAuthor: TextView = view.findViewById(R.id.article_author)
        var articleImage: ImageView = view.findViewById(R.id.article_image)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.article_row, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}