package com.decagon.decagonclassroom.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.decagon.decagonclassroom.R
import com.decagon.decagonclassroom.models.Book
import com.decagon.decagonclassroom.views.adapters.ArticleAdapter
import com.decagon.decagonclassroom.views.adapters.BooksAdapter
import java.util.*
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var articleAdapter: ArticleAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var booksAdapter: BooksAdapter
    lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        var books = ArrayList<Book>()
        books.add(Book(1, "Head First Kotlin", "Benedict Amah", Date()))
        books.add(Book(1, "Head First Javascript", "Tolulope Adeniye", Date()))
        books.add(Book(1, "Head First Python", "Chigozie Asadu", Date()))
        books.add(Book(1, "Head First Golang", "Razaq Darotudeen", Date()))
        books.add(Book(1, "Head First Java", "Osehiase Ehilen", Date()))
        books.add(Book(1, "Head First Brainfork", "Victor Nnaji", Date()))
        books.add(Book(1, "Head First Kotlin", "Adabe Echaim", Date()))

        booksAdapter = BooksAdapter(books)
        viewPager2 = view.findViewById(R.id.bookViewPager)
        viewPager2.adapter = booksAdapter

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
        })

        with(viewPager2) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }

        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)
        viewPager2.setPageTransformer { page, position ->
            val viewPager = page.parent.parent as ViewPager2
            val offset = position * -(2 * offsetPx + pageMarginPx)
            if (viewPager.orientation == ViewPager2.ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -offset
                } else {
                    page.translationX = offset
                }
            } else {
                page.translationY = offset
            }
        }

        articleAdapter =
            ArticleAdapter()
        layoutManager = LinearLayoutManager(this.activity!!.applicationContext)
        recyclerView = view.findViewById(R.id.recyclerViewArticles)
        recyclerView.adapter = articleAdapter
        recyclerView.layoutManager = layoutManager
        return view
    }


}
