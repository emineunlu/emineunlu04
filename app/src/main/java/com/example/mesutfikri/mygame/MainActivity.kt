package com.example.mesutfikri.mygame

import android.content.Intent;
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE: String = "com.example.mesutfikri.mygame.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    /** Called when the user taps the Send button  */
    fun sendMessage(view: View) {
        // Toast Message
        Toast.makeText(this@MainActivity, "Hoş Geldin :)", Toast.LENGTH_SHORT).show();
        // Intent
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<View>(R.id.editText) as EditText
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    }

