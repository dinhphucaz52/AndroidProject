package com.example.test

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
<<<<<<< HEAD
import android.view.Gravity
import android.view.WindowManager.LayoutParams
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
=======
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.test.design_pattern_builder.PizzaEnum
import com.example.test.design_pattern_builder.PizzaStore
import com.example.test.design_pattern_builder.WaterEnum
import java.io.PipedWriter

class MainActivity : AppCompatActivity() {

    private lateinit var dialog_button : Button
    private lateinit var custom_dialog : Button

>>>>>>> 1f3272adad8e70f30ce62d58d2911e7fb1180f1e
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        val btn_dialog:Button = findViewById(R.id.btn_dialog)
        val btn_custom_dialog:Button = findViewById(R.id.btn_custom_dialog)

        btn_custom_dialog.setOnClickListener {
            CustomDialog(this@MainActivity).show()
        }

    }
    fun cout(s: String) {
        Log.d("PHUC", s)
    }
=======
        val orderPizzaStore = PizzaStore.Builder().apply {
            setPizza(PizzaEnum.MEXICAN)
            setWater(WaterEnum.CAPPUCCINO)
        }.build()

        Log.d("PHUC", orderPizzaStore.toString())

    }
>>>>>>> 1f3272adad8e70f30ce62d58d2911e7fb1180f1e
}

