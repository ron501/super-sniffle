package com.mifen.zadanie1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mifen.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cow = Herbivores("cow", 300)
        val hare = Herbivores("hare", 20)
        val bear = Carnivores("bear", 200)
        val fox = Carnivores("fox", 40)
        val list = listOf(cow, hare, bear, fox)
        println(list)//Log.d
    }
}
