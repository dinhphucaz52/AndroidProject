package com.example.test

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import java.util.Objects

class DialogUtil {
    companion object {
        fun openCustomDialog(context: Context, onlistenLogin: interfaceOnlistenLogin) {
            Dialog(context).apply {
                setContentView(R.layout.custom_dialog)
                setCancelable(false)
                window?.setLayout(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                window?.setGravity(
                    Gravity.CENTER
                )

                val edt_account: EditText = findViewById(R.id.edt_account)
                val edt_password: EditText = findViewById(R.id.edt_password)

                findViewById<Button>(R.id.btn_login).setOnClickListener {
                    val accountString: String = edt_account.text.toString()
                    val passwordString: String = edt_password.text.toString()

                    if (accountString == "phuc" && passwordString == "1234") {
                        onlistenLogin.onListenLogin(accountString, passwordString)
                    }

                }

            }.show()
        }
    }
}

interface interfaceOnlistenLogin {
    fun onListenLogin(accountString: String, passwordString: String)
}