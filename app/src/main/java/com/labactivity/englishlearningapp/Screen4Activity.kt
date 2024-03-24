package com.labactivity.englishlearningapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.englishlearningapp.databinding.ActivityScreen4Binding
import java.util.*

class Screen4Activity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var binding: ActivityScreen4Binding
    private lateinit var textToSpeech: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        textToSpeech = TextToSpeech(this, this)

        val editTextInput: EditText = binding.editTextInput
        val buttonSpeak: Button = binding.buttonSpeak

        buttonSpeak.setOnClickListener {
            val text = editTextInput.text.toString()
            speakText(text)
        }
    }

    private fun speakText(text: String) {
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = textToSpeech.setLanguage(Locale.ENGLISH)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                // Language not supported
                // Handle the error if required
            }
        } else {
            // Initialization failed
            // Handle the error if required
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        textToSpeech.stop()
        textToSpeech.shutdown()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, Screen4Activity::class.java)
        }
    }
}
