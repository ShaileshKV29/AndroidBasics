package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_button_click.*

class BirthdayButtonClick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_button_click)

        val name = intent.getStringExtra("name")
        birthdayGreeting.text = "Happy Birthday\n$name!"
    }
}