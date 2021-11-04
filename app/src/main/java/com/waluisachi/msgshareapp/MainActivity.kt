package com.waluisachi.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnShowToast)
        val button2: Button = findViewById(R.id.btnSendMsgToNextActivity)
        val et: EditText = findViewById(R.id.etUserMessage)

        button.setOnClickListener {
            Log.i("MainActivity", "Button clicked")

            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            val message: String = et.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            //Navigate to a new activity(Screen)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}