package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnNavigateMain2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("pphat", "onCreate")

        btnNavigateMain2 = findViewById(R.id.button_navigate_main2)

        btnNavigateMain2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "onDestroy")
    }
}