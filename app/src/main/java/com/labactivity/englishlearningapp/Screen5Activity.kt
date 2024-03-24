package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.englishlearningapp.databinding.ActivityScreen5Binding

class Screen5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityScreen5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add your code for Screen5Activity here
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, Screen5Activity::class.java)
        }
    }
}
