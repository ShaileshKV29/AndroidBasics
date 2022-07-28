package com.example.colourmyblocks

import android.graphics.Color
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
            listOf(text_block_1, text_block_2, text_block_3, text_block_4, text_block_5,
                    constraint_layout, red_btn, yellow_btn, green_btn
                )

        for(item in clickableViews)
        {
            item.setOnClickListener { btnClicked(it) }
        }

    }

    private fun makeColored(view: View)
    {
        when(view.id)
        {
            R.id.text_block_1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_block_2 -> view.setBackgroundColor(Color.MAGENTA)

            R.id.text_block_3 -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.text_block_4 -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.text_block_5 -> view.setBackgroundResource(android.R.color.holo_green_dark)

            R.id.red_btn -> text_block_3.setBackgroundResource(R.color.red_btn_color)
            R.id.yellow_btn -> text_block_4.setBackgroundResource(R.color.yellow_btn_color)
            R.id.green_btn -> text_block_5.setBackgroundResource(R.color.green_btn_color)

            else -> constraint_layout.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun btnClicked(block: View)
    {
        red_btn.setOnClickListener {
            block.setBackgroundResource(R.color.red_btn_color)
        }

        yellow_btn.setOnClickListener {
            block.setBackgroundResource(R.color.yellow_btn_color)
        }

        green_btn.setOnClickListener {
            block.setBackgroundResource(R.color.green_btn_color)
        }

//        when(view.id)
//        {
//
//        }
    }

}