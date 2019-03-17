package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val rollButton = findViewById<Button>(R.id.roll_button)
//        rollButton.text = "Let's Roll"

        val rollButton: Button = roll_button
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = result_text

        val randomInt = Random().nextInt(6) + 1

        resultText.text = randomInt.toString()
    }
}
