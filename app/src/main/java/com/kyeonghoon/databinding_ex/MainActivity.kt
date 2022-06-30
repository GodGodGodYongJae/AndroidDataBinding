package com.kyeonghoon.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1번 방식 - findViewById
        val btn = findViewById<Button>(R.id.testBtmId)
        btn.setOnClickListener {
            Toast.makeText(this,"Click",Toast.LENGTH_LONG).show()
        }

        //2번 방식 Databinding
    }


}