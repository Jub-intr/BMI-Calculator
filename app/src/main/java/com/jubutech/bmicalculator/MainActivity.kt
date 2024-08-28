package com.jubutech.bmicalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityManagerCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jubutech.bmicalculator.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


binding.btn.setOnClickListener {

    val height = binding.heightedt.text.toString().toDouble() / 100
    val weight = binding.heightedt2.text.toString().toDouble()

    val bmi = weight / (height * height)

    binding.txtvw.text = String.format("BMI is : %.2f", bmi)

    binding.txtvw2.text = when(bmi) {
        in 0.0..18.4 -> "UnderWeight"
        in 18.5..25.5 -> "Normal"
        in 25.6..30.5 -> "OverWeight"
        else -> "Obesity"
    }
}

    }
}