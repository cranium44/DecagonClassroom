package com.decagon.decagonclassroom

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.decagon.decagonclassroom.models.Article

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    private var data = arrayListOf(
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        ),
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        ),
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        ),
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        ),
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        ),
        Article(
            "Eloquent Js",
            "Chigozie Asadu"
        )
    )


    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var articleDate: TextView
        var articleTitle: TextView
        var articleAuthor: TextView
        var articleImage: ImageView

        init {
            articleDate = view.findViewById(R.id.article_date)
            articleTitle = view.findViewById(R.id.article_title)
            articleAuthor = view.findViewById(R.id.article_author)
            articleImage = view.findViewById(R.id.article_image)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.article_row, parent, false)
        Log.e("Adapter", "recyclerview created")
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }


    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = data[position]
        holder.articleAuthor.text = article.author
        holder.articleDate.text = "${article.date.time}"
        holder.articleTitle.text = article.title

        Log.d("Adapter", article.author)
    }
}