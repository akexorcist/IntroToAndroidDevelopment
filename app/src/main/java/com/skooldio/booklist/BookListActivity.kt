package com.skooldio.booklist

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity() {
    private var adapter = BookAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupRecyclerView()

        val bookList = mutableListOf(
            Book("1933988673", "Unlocking Android", "W. Frank Ableson", 416),
            Book("1935182080", "Hello! Python", "Anthony Briggs", 350),
            Book("1617291269", "iOS in Practice", "Bear P. Cahill", 325),
            Book("1930110545", ".NET Multithreading", "Alan Dennis", 360),
            Book("1884777597", "Software Requirements", "Benjamin L. Kovitz", 448)
        )
        updateBookList(bookList)
    }

    private fun setupRecyclerView() {
        adapter.setOnItemClickListener(onItemClick)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun updateBookList(bookList: List<Book>?) {
        adapter.setBookList(bookList)
    }

    private val onItemClick = { book: Book ->
        Toast.makeText(this, "${book.title}", Toast.LENGTH_SHORT).show()
    }
}
