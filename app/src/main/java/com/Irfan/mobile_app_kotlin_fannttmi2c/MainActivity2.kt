package com.Irfan.mobile_app_kotlin_fannttmi2c

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var txtWelcome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        txtWelcome = findViewById(R.id.txtWelcome)

            val GetDataUsername = intent.getStringExtra("username")
            val GetDataPassword = intent.getStringExtra("password")

        //tampilkan hasil setelah di get
        txtWelcome.setText("haloo ${GetDataUsername}!\n Password anda adalah : ${GetDataPassword}")




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnQ)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}