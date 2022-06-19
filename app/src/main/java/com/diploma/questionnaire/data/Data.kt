package com.diploma.questionnaire.data

import com.diploma.questionnaire.domain.Answer
import com.diploma.questionnaire.domain.MAXIMALLY_CORRECT_ANSWER_RATE
import com.diploma.questionnaire.domain.Question
import com.diploma.questionnaire.domain.RatePolicy
import com.diploma.questionnaire.domain.WRONG_ANSWER_RATE

// Константа задает заголовок теста на экране
const val TEST_HEADER = "Тест на знание Android"

// Место для хранения вопросов теста.
// Здесь вопросы можно добавлять и изменять.
// В приложении доступ к вопросам осуществляется через переменную questions
object Data {

    var currentQuestionCounter = 0
    var isTestFinished = false

    val questions: List<Question> = listOf(
        // ВОПРОС 1 =========================================================
        Question(
            id = 1,
            questionContent = "В каком потоке работает сервис?",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Фоновом",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Главном",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Среднем",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
        ),
        // ВОПРОС 2 =========================================================
        Question(
            id = 2,
            questionContent = "Укажите базовые компоненты Андроид-приложения:",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Activity",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 2,
                    answerContent = "Fragment",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 3,
                    answerContent = "Service",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 4,
                    answerContent = "Class",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 5,
                    answerContent = "Broadcast Receiver",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 6,
                    answerContent = "Exception",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 7,
                    answerContent = "Content Provider",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
            ),
            isSingleAnswer = false,
            ratePolicy = RatePolicy.ADD_RATES,
        ),
        // ВОПРОС 3 =========================================================
        Question(
            id = 3,
            questionContent = "Родительским элементом для фрагмента может быть:",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Только активити",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Только другой фрагмент",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Как активити, так и другой фрагмент",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
        ),

        /*
        Шаблон для создания нового вопроса:
        // ВОПРОС N =========================================================
        Question(
            id = ,
            questionContent = "",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "",
                    correctnessRate = ,
                ),
                Answer(
                    id = 2,
                    answerContent = "",
                    correctnessRate = ,
                ),
                Answer(
                    id = 3,
                    answerContent = "",
                    correctnessRate = ,
                ),
            ),
            isSingleAnswer = ,
            ratePolicy = ,
        ),
        */
    )
}