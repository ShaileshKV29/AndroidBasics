package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        register_page_link.setOnClickListener{
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            finish()
        }

        login_btn.setOnClickListener {
            when
            {
                TextUtils.isEmpty(username.text.toString().trim { it <= ' ' }) -> {
                    Toast.makeText(
                        this@LoginActivity,
                        "Please enter email",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(password_login.text.toString().trim{ it <= ' '}) -> {
                    Toast.makeText(
                        this@LoginActivity,
                        "Please enter Password",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                else -> {
                    val email: String = username.text.toString().trim{it <= ' '}
                    val password: String = password_login.text.toString().trim{it <= ' '}

                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(
                            OnCompleteListener<AuthResult> { task ->
                                if(task.isSuccessful)
                                {
                                    val firebaseUser: FirebaseUser = task.result!!.user!!

                                    Toast.makeText(
                                        this@LoginActivity,
                                        "You are logged in successfully",
                                        Toast.LENGTH_SHORT
                                    ).show()

                                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                                    // We are clearing out the previous activity instances that were opened from the stack
                                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                    // We are sending data to the other activity
                                    intent.putExtra("user_id", FirebaseAuth.getInstance().currentUser!!.uid )
                                    intent.putExtra("email_id", email)
                                    startActivity(intent)
                                    finish()
                                }
                                else
                                {
                                    Toast.makeText(
                                        this@LoginActivity,
                                        task.exception!!.message.toString(),
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        )
                }
            }
        }
    }
}