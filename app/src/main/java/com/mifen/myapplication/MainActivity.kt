package com.mifen.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause ()
        Log.d(MainActivity::class.simpleName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName, "onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.simpleName, "onRestart")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(MainActivity::class.simpleName, "onSavedInstanceState")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName, "onDestroy")
    }
}