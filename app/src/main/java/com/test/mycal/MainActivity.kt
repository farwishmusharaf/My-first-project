package com.test.mycal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var i =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick.setOnClickListener {
            i++
            textView.setText(i.toString())
        }

        reset.setOnClickListener {
            i=0
            textView.setText(i.toString())
        }
    }
}