package com.example.mesutfikri.mygame


import android.content.Intent;
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;
import android.view.View
import android.widget.Toast

class gamer : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE: String = "com.example.mesutfikri.mygame.guess"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_gamer)
   }
fun sendGuess(view: View) {

    val intent1 = Intent(this, counterr::class.java)
    val editText = findViewById<View>(R.id.editText2) as EditText
    val guess = editText.text.toString()
    intent1.putExtra(gamer.EXTRA_MESSAGE, guess)
    startActivity(intent1)
}
}





