package com.example.colourmyblocks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners()
    {
        val clickableViews: List<View> =
            listOf(text_block_1, text_block_2, text_block_3, text_block_4, text_block_5)

        for(item in clickableViews)
        {
            item.setOnClickListener { makeColored(it) }
        }
    }
}