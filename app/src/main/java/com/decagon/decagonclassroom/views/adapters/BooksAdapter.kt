package com.decagon.decagonclassroom.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.models.Book

class BooksAdapter(var data: ArrayList<Book>) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.books_row, parent, false)
        return BooksViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val cur = data[position]

    }

}