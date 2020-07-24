package com.example.hi.mykotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = sum(5, 6)
        print(result)

    }

    fun sum(number1: Int, number2: Int): Int {
        val add = number1 + number2
        return add
    }
}
