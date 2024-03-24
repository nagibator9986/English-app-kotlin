package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class lesson5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, lesson5::class.java)
        }
    }
}