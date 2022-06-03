package com.diploma.questionnaire.domain

// Константа для множественных правильных вариантов ответа, задающая сумму их баллов.
// Например, при 100 баллах, если есть 4 правильных ответа, то correctnessRate у каждого из них
// должен быть 25.
// Если правильный ответ единственный, его correctnessRate должен быть равен значению этой константы.
const val MAXIMALLY_CORRECT_ANSWER_RATE = 100

// Константа, задающая количество баллов (correctnessRate) неправильного ответа
const val WRONG_ANSWER_RATE = 0

// Класс описывает ответ - один из элементов списка ответов на вопрос теста.
data class Answer(
    val id: Int, // номер ответа
    val answerContent: String, // текст ответа для вывода на экран
    val correctnessRate: Int, // количество баллов за правильный ответ, ограничено константами (см.выше)
    var isSelected: Boolean = false, // признак: выбран ли этот ответ пользователем на экране
)
