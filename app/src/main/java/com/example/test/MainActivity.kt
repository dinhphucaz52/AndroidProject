package com.example.test

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var dialog_button : Button
    private lateinit var custom_dialog : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog_button = findViewById(R.id.dialog_button)
        custom_dialog = findViewById(R.id.custom_dialog)

        dialog_button.setOnClickListener {
            dialog2()
        }

    }

    fun dialog1() {
        AlertDialog.Builder(this@MainActivity, android.R.style.ThemeOverlay_Material_Dialog_Alert).apply {
            setTitle("Notification")
            setMessage("Have a new update")
            setIcon(android.R.drawable.ic_dialog_dialer)
            setCancelable(false)
            setPositiveButton("Accept", { _, _ ->
                Toast.makeText(this@MainActivity, "Accept", Toast.LENGTH_SHORT).show()
            })
            setNegativeButton("Quit") { _, _ ->
                Toast.makeText(this@MainActivity, "Quit", Toast.LENGTH_SHORT).show()
            }
            setNeutralButton("Help") { _, _ ->
                Toast.makeText(this@MainActivity, "Help", Toast.LENGTH_SHORT).show()
            }
        }.show()
    }
    fun dialog2() {
        AlertDialog.Builder(this@MainActivity).apply {
            setTitle("Pick color")
            setCancelable(false)
            val listItemsColor:Array<String> = arrayOf("Red", "Green", "Blue", "Orange")
            var color:String = ""
            setSingleChoiceItems(listItemsColor, -1) { _, index ->
                color = listItemsColor.getOrNull(index) ?: ""
            }
            setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this@MainActivity, color, Toast.LENGTH_SHORT).show()
            }
        }.show()
    }
}

