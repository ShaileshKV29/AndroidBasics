package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getItemsList(): ArrayList<String>{
        val list = ArrayList<String>()

        for(i in 1..15)
        {
            list.add("Item $i")
        }
        // This is the dataset we are using
        return list
    }
}