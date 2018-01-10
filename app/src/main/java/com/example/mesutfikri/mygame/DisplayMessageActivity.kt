package com.example.mesutfikri.mygame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.View
import android.widget.Button

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView3)
        textView.text = message



        val myButton = findViewById<View>(R.id.button2) as Button
        myButton.setOnClickListener {
            val intent = Intent(this@DisplayMessageActivity, gamer::class.java)
            startActivity(intent)

        }
    }
}
