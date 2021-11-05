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
        val shareBtn: Button = findViewById(R.id.btnShareToOtherApps)
        val rvbutton: Button = findViewById(R.id.btnRecyclerView)

        button.setOnClickListener {
            Log.i("MainActivity", "Button clicked")

            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            val message: String = et.text.toString()
            //Navigate to a new activity(Screen)
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        shareBtn.setOnClickListener {
            val message: String = et.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to :"))

        }

        rvbutton.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}