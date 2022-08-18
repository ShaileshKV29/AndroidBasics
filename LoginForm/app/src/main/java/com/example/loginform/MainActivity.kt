package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The data we sent earlier is received here
        val userId = intent.getStringExtra("user_id")
        val emailId = intent.getStringExtra("email_id")

        user_id_show.text = "USER ID: $userId"
        user_email_show.text = "USER EMAIL: $emailId"

        logout_btn.setOnClickListener {
            // Logout from app
            FirebaseAuth.getInstance().signOut()

            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        }
    }
}