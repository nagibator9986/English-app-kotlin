package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.englishlearningapp.databinding.ActivityScreen2Binding

class Screen2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            // Handle button 1 click
            // Example: Proceed to Screen3Activity
            startActivity(Screen3Activity.newIntent(this))
        }

        binding.btn2.setOnClickListener {
            // Handle button 2 click
            // Example: Proceed to Screen4Activity
            startActivity(Screen4Activity.newIntent(this))
        }

        binding.btn3.setOnClickListener {
            // Handle button 3 click
            // Example: Proceed to Screen5Activity
            startActivity(Screen5Activity.newIntent(this))
        }

        binding.btn4.setOnClickListener {
            // Handle button 4 click
            // Example: Exit the whole app
            finishAffinity()
        }
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, Screen2Activity::class.java)
        }
    }
}


