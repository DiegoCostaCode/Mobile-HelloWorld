package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var xModelo = 0
        var yModelo = 0

        val botaoXUp: Button = findViewById(R.id.buttonXup)
        val botaoXDown: Button = findViewById(R.id.buttonXdown)
        val viewX: TextView = findViewById(R.id.resultado)

        botaoXUp.setOnClickListener {
            xModelo += 1
            viewX.text = "${xModelo}"
        }
        botaoXDown.setOnClickListener {
            xModelo -= 1
            viewX.text = "${xModelo}"

}
    }
}