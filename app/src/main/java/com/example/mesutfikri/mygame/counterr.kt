package com.example.mesutfikri.mygame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mesutfikri.mygame.R.id.button
import com.example.mesutfikri.mygame.R.id.textView2
import kotlinx.android.synthetic.main.activity_gamer.*
import java.util.*
import java.util.Calendar.*
class counterr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_counterr)
        var success = "X"

            var c = getInstance()
            var minute = c.get(MINUTE)
            var hour = c.get(HOUR_OF_DAY)
            var second = c.get(SECOND)
            var seconds = "0"
            var minutes = "0"
            var hours = "0"

            // saat tek haneli olunca birimlere ayırmak kolay olsun diye tek hane olursa başına "0" ekliyoruz
            if (second < 10) seconds = "0" + second.toString()
            else seconds = second.toString()
            if (minute < 10) minutes = "0" + minute.toString()
            else minutes = minute.toString()
            if (hour < 10) hours = "0" + hour.toString()
            else hours = hour.toString()

            val hours1 = (hours.subSequence(0, 1).toString())
            val hours2 = (hours.subSequence(1, 2).toString())
            val minutes1 = (minutes.subSequence(0, 1).toString())
            val minutes2 = (minutes.subSequence(1, 2).toString())
            val seconds1 = (seconds.subSequence(0, 1).toString())
            val seconds2 = (seconds.subSequence(1, 2).toString())

            var text =hours1 + hours2 + ":" + minutes1 + minutes2 + ":" + seconds1 + seconds2
            var textView = findViewById<TextView>(R.id.textView)
            textView.text = (text)

            val hourn1 = (hours.subSequence(0, 1).toString()).toInt()
            val hourn2 = (hours.subSequence(1, 2).toString()).toInt()
            val minuten1 = (minutes.subSequence(0, 1).toString()).toInt()
            val minuten2 = (minutes.subSequence(1, 2).toString()).toInt()
            val secondn1 = (seconds.subSequence(0, 1).toString()).toInt()
            val secondn2 = (seconds.subSequence(1, 2).toString()).toInt()
            val result = hourn1 + hourn2 + minuten1 + minuten2 + secondn1 + secondn2
            var results = result.toString()
            var textView1 = findViewById<TextView>(R.id.textView2)
            textView1.text = ("Doğru cevap :   " + results)

            val intent1 = intent
            val tahmins1 = intent1.getStringExtra(gamer.EXTRA_MESSAGE)

            if (results != tahmins1)
                success = " "

        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        if (success == " ")
        Toast.makeText(this@counterr, "Yanlış Cevap "+message+" !!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this@counterr, "Süper "+message+" bildin!!", Toast.LENGTH_SHORT).show()
    }
    fun play_again(view: View){
        val intent2 = Intent(this, gamer::class.java)
        startActivity(intent2)


    }

    }





