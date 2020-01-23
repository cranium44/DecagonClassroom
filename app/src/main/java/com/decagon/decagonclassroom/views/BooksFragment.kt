package com.decagon.decagonclassroom.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.models.Book
import com.decagon.decagonclassroom.views.adapters.BooksAdapter
import java.util.*
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class BooksFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    var books = ArrayList<Book>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_books, container, false)


        books.add(Book(1, "Head First Kotlin", "Benedict Amah", Date()))
        books.add(Book(1, "Head First Javascript", "Tolulope Adeniye", Date()))
        books.add(Book(1, "Head First Python", "Chigozie Asadu", Date()))
        books.add(Book(1, "Head First Golang", "Razaq Darotudeen", Date()))
        books.add(Book(1, "Head First Java", "Osehiase Ehilen", Date()))
        books.add(Book(1, "Head First Brainfork", "Victor Nnaji", Date()))
        books.add(Book(1, "Head First Kotlin", "Adabe Echaim", Date()))


        recyclerView = view.findViewById(R.id.books_recycler_view)
        recyclerView.adapter = BooksAdapter(books)
        recyclerView.layoutManager = GridLayoutManager(view.context, 2)
        return view
    }


}
