package com.example.test

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.VectorEnabledTintResources

class DialogUtil {
    companion object {
        fun showLoginDialog(context: Context, onLoginSucces: ((String, String) -> Unit)?=null) {
            val dialog: Dialog = Dialog(context)
                .apply {
                    setContentView(R.layout.custom_dialog)
                    setCancelable(false)
                    window?.setLayout(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )
                    window?.setGravity(
                        Gravity.CENTER
                    )

                    val edt_account: EditText = findViewById(R.id.edt_account);
                    val edt_password: EditText = findViewById(R.id.edt_password);

                    findViewById<Button>(R.id.btn_login)
                        .setOnClickListener {
                            val accountString = edt_password.text.toString()
                            val passwordString = edt_password.text.toString()
                            onLoginSucces?.invoke(accountString, passwordString)
                        }
                }
            dialog.show()
        }
    }
}
