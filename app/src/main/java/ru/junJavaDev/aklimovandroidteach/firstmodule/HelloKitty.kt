package ru.junJavaDev.aklimovandroidteach.firstmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import ru.junJavaDev.aklimovandroidteach.R

class HelloKitty : AppCompatActivity() {
    private lateinit var textViewHelloKitty: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_kitty)
        textViewHelloKitty = findViewById(R.id.textViewHelloKitty)

        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editText)
        //val imageButton = findViewById<ImageButton>(R.id.imageButton)
        //val imageButton = findViewById(R.id.imageButton) as ImageButton

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textViewHelloKitty.text = "Hello Kitty"

            } else {
                textViewHelloKitty.text = "Привет, " + editText.text
            }

        }
    }
}