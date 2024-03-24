package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PronunciationGuides : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pronunciation_guides)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, PronunciationGuides::class.java)
        }
    }
}