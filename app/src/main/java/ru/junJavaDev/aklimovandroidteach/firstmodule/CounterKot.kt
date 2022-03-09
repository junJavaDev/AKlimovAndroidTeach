package ru.junJavaDev.aklimovandroidteach.firstmodule

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.junJavaDev.aklimovandroidteach.R

class CounterKot : AppCompatActivity() {
    private lateinit var textViewCounterKotDog: TextView
    private var counterKot: Int = 0
    private var counterDog: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.counter_kot)

        val textViewCounterKotDog: TextView = findViewById(R.id.textViewCounterKotDog)

        val buttonSayHi: Button = findViewById(R.id.button_say_hi)
        val buttonCounterKot: Button = findViewById(R.id.button_counter_kot)
        val buttonCounterDog: Button = findViewById(R.id.button_counter_dog)


        buttonSayHi.setOnClickListener {
            textViewCounterKotDog.text = getString(R.string.hi)
            it.setBackgroundColor(Color.RED)
        }

        buttonCounterKot.setOnClickListener {
            textViewCounterKotDog.text = "Я насчитал ${++counterKot} ворон"
        }

        buttonCounterDog.setOnClickListener {
            textViewCounterKotDog.text = "Я насчитал ${++counterDog} собак"
        }


    }
}