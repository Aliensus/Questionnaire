package com.diploma.questionnaire.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.diploma.questionnaire.R
import com.diploma.questionnaire.data.Data.questions

class MainActivity : AppCompatActivity() {
    private lateinit var testHeaderTv : TextView
    private lateinit var questionHeaderTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testHeaderTv = findViewById(R.id.testHeaderTv)
        //testHeaderTv.text = "Заголовок вопроса"
        questionHeaderTv = findViewById(R.id.questionHeaderTv)
        //questionHeaderTv.text = "Текст вопроса"

        val questions = questions.map {it ->
            it.questionContent + R.string.app_name
            questionHeaderTv.text = it.questionContent
        }

    }

}