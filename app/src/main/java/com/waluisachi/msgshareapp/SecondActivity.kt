package com.waluisachi.msgshareapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val TextV : TextView = findViewById(R.id.tvUserMessage)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        TextV.text = msg
    }
}