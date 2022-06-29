package com.diploma.questionnaire.data

import com.diploma.questionnaire.domain.Answer
import com.diploma.questionnaire.domain.MAXIMALLY_CORRECT_ANSWER_RATE
import com.diploma.questionnaire.domain.Question
import com.diploma.questionnaire.domain.RatePolicy
import com.diploma.questionnaire.domain.WRONG_ANSWER_RATE


// Место для хранения вопросов теста.
// В приложении доступ к вопросам осуществляется через переменную questions
object Data {

    var currentQuestionCounter = 0
    var isTestFinished = false

    val questions: List<Question> = listOf(
        // ВОПРОС 1 =========================================================
        Question(
            id = 1,
            questionContent = "Алгоритм обхода графа отличается от алгоритма обхода вершин дерева тем, что…",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "У деревьев есть корни",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Графы могут иметь циклы",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Все утверждения выше ошибочны: дерево — подмножество графа",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Графы",
        ),

        // ВОПРОС 2 =========================================================
        Question(
            id = 2,
            questionContent = "Какой алгоритм из нижеперечисленных будет самым производительным, если дан уже отсортированный массив?",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Сортировка слиянием",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Сортировка вставками",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Быстрая сортировка",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "Пирамидальная сортировка",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Алгоритмы сортировки",
        ),

        // ВОПРОС 3 =========================================================
        Question(
            id = 3,
            questionContent = "Подпрограмма, в которой содержится обращение к самой себе",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Рекуррентная",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Релевантная",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Рекурсивная",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "Резидентная",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Рекурсия",
        ),

        // ВОПРОС 4 =========================================================
        Question(
            id = 4,
            questionContent = "Какие языки программирования относятся к объектно ориентированным?",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "C++",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "HTML",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Java",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "Kotlin",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 5,
                    answerContent = "Си",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = false,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Объектно-ориентированное программирование",
        ),

        // ВОПРОС 5 =========================================================
        Question(
            id = 5,
            questionContent = "Чтобы алгоритм бинарного поиска работал правильно, нужно, чтобы массив (список) был:",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Отсортированным",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Несортированным",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "В куче",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "В стеке",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Алгоритмы поиска",
        ),

        // ВОПРОС 6 =========================================================
        Question(
            id = 6,
            questionContent = "Доступ к элементам в очереди организован по принципу:",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "LIFO",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "FILO",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "LILO",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "FIFO",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Коллекции",
        ),

        // ВОПРОС 7 =========================================================
        Question(
            id = 7,
            questionContent = "Двуместная логическая операция, результатом которой является «истина», " +
                    "если оба операнда принимают значение «истина», и «ложь» - в остальных случаях",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Конъюнкция",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Дизъюнкция",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Инкапсуляция",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "Конкатенация",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Логические операции",
        ),

        // ВОПРОС 8 =========================================================
        Question(
            id = 8,
            questionContent = "Принципы объектно-ориентированного программирования",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Наследование",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 2,
                    answerContent = "Инкапсуляция",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 3,
                    answerContent = "Композиция",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 2,
                ),
                Answer(
                    id = 4,
                    answerContent = "Абстрация",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
                Answer(
                    id = 5,
                    answerContent = "Полиморфизм",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 4,
                ),
            ),
            isSingleAnswer = false,
            ratePolicy = RatePolicy.ADD_RATES,
            theme = "Объектно-ориентированное программирование",
        ),

        // ВОПРОС 9 =========================================================
        Question(
            id = 9,
            questionContent = "Какие операторы относятся к операторам ветвления?",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "if-else",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 2,
                ),
                Answer(
                    id = 2,
                    answerContent = "while",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 2,
                ),
                Answer(
                    id = 3,
                    answerContent = "switch-case",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE / 2,
                ),
                Answer(
                    id = 4,
                    answerContent = "for",
                    correctnessRate = -MAXIMALLY_CORRECT_ANSWER_RATE / 2,
                ),
            ),
            isSingleAnswer = false,
            ratePolicy = RatePolicy.ADD_RATES,
            theme = "Операторы",
        ),

        // ВОПРОС 10 =========================================================
        Question(
            id = 10,
            questionContent = "Область оперативной памяти, отводимая программе для хранения данных, объем которых заранее не известен",
            answers = listOf(
                Answer(
                    id = 1,
                    answerContent = "Буфер",
                    correctnessRate = MAXIMALLY_CORRECT_ANSWER_RATE,
                ),
                Answer(
                    id = 2,
                    answerContent = "Стек",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 3,
                    answerContent = "Куча",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
                Answer(
                    id = 4,
                    answerContent = "Кэш",
                    correctnessRate = WRONG_ANSWER_RATE,
                ),
            ),
            isSingleAnswer = true,
            ratePolicy = RatePolicy.ALL_OR_NOTHING,
            theme = "Хранение данных",
        ),

    )
}