package com.diploma.questionnaire.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.diploma.questionnaire.R
import com.diploma.questionnaire.data.Data.currentQuestionCounter
import com.diploma.questionnaire.data.Data.questions
import com.diploma.questionnaire.data.Data.isTestFinished
import com.diploma.questionnaire.data.TEST_HEADER

class MainActivity : AppCompatActivity() {
    private lateinit var testHeaderTv : TextView
    private lateinit var questionHeaderTv : TextView
    private lateinit var questionContentTv : TextView
    private lateinit var answerListView: ListView
    private lateinit var nextButton: Button
    private lateinit var prevButton: Button
    private lateinit var startButton: Button
    private lateinit var exitButton: Button
    private lateinit var questionsContainer: LinearLayout
    private lateinit var resultContainer: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testHeaderTv = findViewById(R.id.testHeaderTv)
        testHeaderTv.text = TEST_HEADER
        questionHeaderTv = findViewById(R.id.questionHeaderTv)
        questionContentTv = findViewById(R.id.questionContentTv)
        answerListView = findViewById(R.id.answerListView)
        nextButton = findViewById(R.id.nextButton)
        prevButton = findViewById(R.id.prevButton)
        startButton = findViewById(R.id.startButton)
        exitButton = findViewById(R.id.exitButton)
        questionsContainer = findViewById(R.id.questionsContainer)
        resultContainer = findViewById(R.id.resultContainer)

        manageContainersVisibility()
        showCurrentQuestion(currentQuestionCounter)

        nextButton.setOnClickListener { onNextButtonClickListener() }
        prevButton.setOnClickListener { onPrevButtonClickListener() }
        startButton.setOnClickListener { onStartButtonClickListener() }
        exitButton.setOnClickListener { onExitButtonClickListener() }
        answerListView.onItemClickListener = OnAnswerItemClickListener

    }

    private fun manageButtonsVisibility() {
        if (currentQuestionCounter == 0) {
            prevButton.isEnabled = false
        } else {
            prevButton.isEnabled = true
        }
        if (currentQuestionCounter == questions.size - 1) {
            nextButton.text = getString(R.string.label_finish)
        } else {
            nextButton.text = getString(R.string.label_next)
        }
    }

    private fun manageContainersVisibility() {
        if (isTestFinished) {
            questionsContainer.visibility = View.GONE
            resultContainer.visibility = View.VISIBLE
        } else {
            resultContainer.visibility = View.GONE
            questionsContainer.visibility = View.VISIBLE
        }
    }

    private fun showCurrentQuestion(questionId: Int) {
        val currentQuestion = questions[questionId]
        questionHeaderTv.text = getString(
            R.string.question_prefix,
            currentQuestion.id,
            questions.size
        )
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
        manageButtonsVisibility()
    }

    private fun showTestResults() {
        manageContainersVisibility()

    }

    private fun onNextButtonClickListener() {
        if (currentQuestionCounter < questions.size - 1) {
            currentQuestionCounter++
            showCurrentQuestion(currentQuestionCounter)
        } else {
            isTestFinished = true
            showTestResults()
        }
    }

    private fun onPrevButtonClickListener() {
        currentQuestionCounter--
        showCurrentQuestion(currentQuestionCounter)
    }

    private fun clearAllUserResults() {
        questions.forEach { question ->
            question.isAnswered = false
            question.answers.forEach { it.isSelected = false }
        }
        currentQuestionCounter = 0
        isTestFinished = false
    }

    private fun onStartButtonClickListener() {
        clearAllUserResults()
        showCurrentQuestion(currentQuestionCounter)
        manageContainersVisibility()
    }

    private fun onExitButtonClickListener() {
        clearAllUserResults()
        finish()
    }

    object OnAnswerItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(
            answerListView: AdapterView<*>?,
            clickedView: View?,
            position: Int,
            index: Long
        ) {
            val currentQuestion = questions[currentQuestionCounter]
            val currentAnswer = currentQuestion.answers[position]
            if (currentQuestion.isSingleAnswer) {
                currentQuestion.answers.firstOrNull { it.isSelected }?.isSelected = false
            }
            currentAnswer.isSelected = (answerListView as ListView).isItemChecked(position)
            currentQuestion.isAnswered = true
        }
    }

}