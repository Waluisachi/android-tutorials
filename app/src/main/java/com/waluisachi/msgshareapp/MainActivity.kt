package com.waluisachi.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnShowToast)

        button.setOnClickListener {
            Log.i("MainActivity", "Button clicked")

            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}