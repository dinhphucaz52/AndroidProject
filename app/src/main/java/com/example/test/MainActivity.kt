package com.example.test

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.WindowManager.LayoutParams
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open_custom_alert_diaglog:Button = findViewById(R.id.btn_open_custom_alert_diaglog);

        btn_open_custom_alert_diaglog.setOnClickListener {
            Dialog(this@MainActivity).apply {
                setCancelable(false)
                setContentView(R.layout.custom_dialog)
                window?.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                window?.setGravity(Gravity.CENTER)

                val btn_yes:Button = findViewById(R.id.btn_yes)
                val btn_no:Button = findViewById(R.id.btn_no)

                btn_yes.setOnClickListener {
                    dismiss()
                }

                btn_no.setOnClickListener {
                    dismiss()
                }

            }.show()
        }

    }
}


