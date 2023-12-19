package com.example.test

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.WindowManager.LayoutParams
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var dialog_button : Button
    private lateinit var custom_dialog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_dialog:Button = findViewById(R.id.btn_dialog)
        val btn_custom_dialog:Button = findViewById(R.id.btn_custom_dialog)

        btn_custom_dialog.setOnClickListener {
            CustomDialog(this@MainActivity).show()
        }

    }
    fun cout(s: String) {
        Log.d("PHUC", s)
    }
}

