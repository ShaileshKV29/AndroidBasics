package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        createBirthdayBtn.setOnClickListener {
//
//        }
    }

    fun createBirthdayCard(view: View)
    {
        val name = name_input.editableText.toString()
        val intent = Intent(this, BirthdayButtonClick::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}