package com.skooldio.booklist.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skooldio.booklist.R
import com.skooldio.booklist.vo.Book
import kotlinx.android.synthetic.main.activity_book_info.*
import kotlinx.android.synthetic.main.activity_main.textViewAuthor
import kotlinx.android.synthetic.main.activity_main.textViewTitle

class BookInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_info)

        val bundle = intent
        val book: Book? = bundle.getParcelableExtra("book")

        textViewIsbn.text = book?.isbn ?: "-"
        textViewTitle.text = book?.title ?: "-"
        textViewAuthor.text = book?.author ?: "-"
        textViewPages.text = "${book?.pages ?: 0}"
    }
}
