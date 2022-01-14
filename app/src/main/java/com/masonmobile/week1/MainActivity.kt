package com.masonmobile.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masonmobile.week1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
           val name = binding.txtName.text.toString()
            binding.lblText.text = "Hello " + name
        }
    }
}