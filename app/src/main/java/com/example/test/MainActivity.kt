package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open_custom_dialog: Button = findViewById(R.id.btn_open_custom_dialog)
        btn_open_custom_dialog.setOnClickListener {
            DialogUtil.openCustomDialog(this@MainActivity) { accountString, passwordString ->
                Toast.makeText(this@MainActivity, accountString + passwordString, Toast.LENGTH_SHORT).show()
            }
        }

    }
}