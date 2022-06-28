package com.diploma.questionnaire.domain

// Класс описывает вопрос - один элемент списка вопросов теста.
// Правильных ответов на вопрос может быть как один, так и несколько
data class Question(
    val id: Int, // номер вопроса
    val questionContent: String, // текст вопроса для вывода на экран
    val answers: List<Answer>, // список ответов на этот вопрос
    val isSingleAnswer: Boolean, // признак: единственный или множественный ожидается ответ
    val ratePolicy: RatePolicy, // политика оценки ответа на этот вопрос
    var isAnswered: Boolean = false, // признак: дан ли уже ответ на этот вопрос
    val theme: String,
    var isCorrectlyAnswered: Boolean = false,
)

// Виды политик оценки ответа на вопрос теста.
// Задают разные способы начисления баллов за ответ, которые далее обрабатываются приложением.
enum class RatePolicy {
    // Хотя бы 1 неправильный выбранный вариант ответа означает, что ответ на весь вопрос дан
    // полностью неверно. Иначе - полностью верно.
    ALL_OR_NOTHING,

    // Количество баллов за ответ вычисляется путем сложения величин, заданных
    // в поле correctnessRate у Answer
    ADD_RATES,
}