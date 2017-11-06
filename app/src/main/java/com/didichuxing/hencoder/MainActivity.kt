package com.didichuxing.hencoder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hencoder.hencoderpracticedraw1.Learn1Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { startActivity(Intent(MainActivity@ this, Learn1Activity::class.java)) }
    }

}
