package com.example.test

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orderPizzaStore = PizzaStore.Builder().apply {
            setPizza(PizzaEnum.MEXICAN)
            setWater(WaterEnum.CAPPUCCINO)
        }.build()

        Log.d("PHUC", orderPizzaStore.toString())

    }
}

