package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)

        val checkPython = findViewById<CheckBox>(R.id.python)

        val checkJava = findViewById<CheckBox>(R.id.java)

        boton.setOnClickListener {
            if(checkPython.isChecked && checkJava.isChecked)
                Toast.makeText(this@MainActivity, "Pyhon + Java", Toast.LENGTH_LONG).show()
            else if(checkJava.isChecked)
                Toast.makeText(this@MainActivity, "Java", Toast.LENGTH_LONG).show()
            else if(checkPython.isChecked)
                Toast.makeText(this@MainActivity, "Python", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this@MainActivity, "Seleccone una opcion", Toast.LENGTH_LONG).show()
        }
    }
}