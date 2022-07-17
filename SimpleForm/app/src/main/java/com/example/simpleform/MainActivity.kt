package com.example.simpleform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.simpleform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            signInBtn.setOnClickListener {
                sign_in(it)
            }
        }
    }

    private fun sign_in(view: View) {
        binding.enteredEmail.text = binding.userEmail.text
        binding.enteredEmail.visibility = View.VISIBLE

        binding.enteredPassword.text = binding.userPassword.text
        binding.enteredPassword.visibility = View.VISIBLE
    }
}