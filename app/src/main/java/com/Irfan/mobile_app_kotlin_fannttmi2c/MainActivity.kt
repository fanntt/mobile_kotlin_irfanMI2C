package com.Irfan.mobile_app_kotlin_fannttmi2c

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var txtUser : EditText
    private lateinit var txtPass : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        txtUser = findViewById(R.id.txtUser)
        txtPass = findViewById(R.id.txtPassword)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin.setOnClickListener(){

            val username = txtUser.text.toString()
            val password = txtPass.text.toString()

            if (username == "admin" && password == "123456") {

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Invalid Password or Username", Toast.LENGTH_SHORT).show()
            }

            // val intentMenu = Intent(this@MainActivity, MainActivity2::class.java)
            //startActivity(intentMenu)
        }
    }
}