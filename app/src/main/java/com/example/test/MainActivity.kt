package com.example.test

import android.app.Dialog
import android.content.Intent
import android.content.res.AssetFileDescriptor.AutoCloseOutputStream
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.WindowManager.LayoutParams
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edt_account: EditText
    private lateinit var edt_password: EditText
    private lateinit var btn_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open_custom_dialog: Button = findViewById(R.id.btn_open_custom_dialog)
        btn_open_custom_dialog.setOnClickListener {
            DialogUtil.showLoginDialog(this@MainActivity) { a, b ->
                Toast.makeText(this@MainActivity, a + b, Toast.LENGTH_SHORT).show()
            }
        }

    }
}