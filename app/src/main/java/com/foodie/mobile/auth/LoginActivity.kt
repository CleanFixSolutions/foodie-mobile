package com.foodie.mobile.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.foodie.mobile.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passEditText)
        val registerButton: Button = findViewById(R.id.loginButton)
        val registerRedirectText: TextView = findViewById(R.id.registerRedirectText)

        registerButton.setOnClickListener {
            val mail = mailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (mail == "" || password == "") {
                Toast.makeText(this, R.string.auth_empty_field_toast, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, R.string.login_successfully_login_toast, Toast.LENGTH_SHORT).show()
            }
        }

        registerRedirectText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
