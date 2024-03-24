package com.labactivity.englishlearningapp
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.englishlearningapp.databinding.ActivityScreen3Binding

class Screen3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityScreen3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn6.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(PronunciationGuides.newIntent(this))
        }
        binding.btn7.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(lesson2.newIntent(this))
        }
        binding.btn8.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(lesson3.newIntent(this))
        }
        binding.btn9.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(lesson4.newIntent(this))
        }
        binding.btn10.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(lesson5.newIntent(this))
        }
        binding.btn11.setOnClickListener {
            // Handle button 6 click
            // Example: Start PronunciationGuidesActivity
            startActivity(lesson6.newIntent(this))
        }
    }
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, Screen3Activity::class.java)
        }
    }
}