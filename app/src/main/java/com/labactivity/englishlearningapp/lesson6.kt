package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class lesson6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, lesson6::class.java)
        }
    }
}