package com.example.test

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText

class CustomDialog(context: Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog)


        val editText = findViewById<EditText>(R.id.edt_feedback)
        val buttonNo = findViewById<Button>(R.id.btn_no)
        val buttonYes = findViewById<Button>(R.id.btn_yes)

        window?.setGravity(Gravity.CENTER)
        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

        buttonNo.setOnClickListener {
            dismiss()
        }

        buttonYes.setOnClickListener {
            dismiss()
        }

    }
}