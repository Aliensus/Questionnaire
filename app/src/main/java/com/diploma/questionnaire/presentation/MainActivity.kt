package com.diploma.questionnaire.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diploma.questionnaire.R
import com.diploma.questionnaire.data.Data.questions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val questions = questions.map {it ->
            it.questionContent.uppercase() + R.string.app_name
        }
    }
}