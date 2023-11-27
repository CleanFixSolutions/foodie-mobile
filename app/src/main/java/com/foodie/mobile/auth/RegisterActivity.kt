package com.foodie.mobile.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.foodie.mobile.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val loginEditText: EditText = findViewById(R.id.loginEditText)
        val mailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passEditText)
        val registerButton: Button = findViewById(R.id.loginButton)
        val loginRedirectText: TextView = findViewById(R.id.loginRedirectText)

        registerButton.setOnClickListener {
            val login = loginEditText.text.toString().trim()
            val mail = mailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (login == "" || mail == "" || password == "") {
                Toast.makeText(this, R.string.auth_empty_field_toast, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, R.string.register_successfully_registered_toast, Toast.LENGTH_SHORT).show()
            }
        }

        loginRedirectText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
