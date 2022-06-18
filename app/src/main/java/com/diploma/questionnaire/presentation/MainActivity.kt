package com.diploma.questionnaire.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.diploma.questionnaire.R
import com.diploma.questionnaire.data.Data.questions
import com.diploma.questionnaire.data.TEST_HEADER

class MainActivity : AppCompatActivity() {
    private lateinit var testHeaderTv : TextView
    private lateinit var questionHeaderTv : TextView
    private lateinit var questionContentTv : TextView
    private lateinit var answerListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testHeaderTv = findViewById(R.id.testHeaderTv)
        testHeaderTv.text = TEST_HEADER
        questionHeaderTv = findViewById(R.id.questionHeaderTv)
        questionContentTv = findViewById(R.id.questionContentTv)
        answerListView = findViewById(R.id.answerListView)

        showCurrentQuestion(1)

    }

    private fun showCurrentQuestion(questionId: Int) {
        val currentQuestion = questions[questionId]
        questionHeaderTv.text = getString(R.string.question_prefix, currentQuestion.id)
        questionContentTv.text = currentQuestion.questionContent
        val answers = currentQuestion.answers.map { it.answerContent }
        if (currentQuestion.isSingleAnswer) {
            answerListView.choiceMode = ListView.CHOICE_MODE_SINGLE
            answerListView.adapter = ArrayAdapter(
                this,
                android.R.layout.select_dialog_singlechoice,
                answers
            )
        } else {
            answerListView.choiceMode = ListView.CHOICE_MODE_MULTIPLE
            answerListView.adapter = ArrayAdapter(
                this,
                android.R.layout.select_dialog_multichoice,
                answers
            )
        }
        currentQuestion.answers.forEachIndexed { index, answer ->
            answerListView.setItemChecked(index, answer.isSelected)
        }

    }

}