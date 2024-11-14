package com.example.loginapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usernameField = findViewById<EditText>(R.id.editTextUsername)
        val passwordField = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()
            if (username == "TesteUsuario" && password == "senha123") {
                welcomeMessage.visibility = View.VISIBLE
            }
        }
    }
}