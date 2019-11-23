package com.skooldio.booklist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_book_info.*

class BookInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_info)

        val bundle = intent
        // TODO Use parcelable
        val isbn = bundle.getStringExtra("isbn")
        val title = bundle.getStringExtra("title")
        val author = bundle.getStringExtra("author")
        val pages = bundle.getIntExtra("pages", 0)

        textViewIsbn.text = isbn
        textViewTitle.text = title
        textViewAuthor.text = author
        textViewPages.text = "$pages"
    }
}
