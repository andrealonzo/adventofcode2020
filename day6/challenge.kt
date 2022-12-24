package com.aalonzo.adventofcode2020.day6
import java.io.File

fun answer(input: String, getNumYes: (String) -> Int): Int {
    var numYes = 0
    for (group in input.split("\n\n".toRegex())) {
        numYes +=getNumYes(group)
    }
    return numYes
}
fun answer1(input: String): Int {
    return answer(input, ::part1NumYes)
}
fun answer2(input: String): Int {
    return answer(input, ::part2NumYes)
}

fun part1NumYes(group: String): Int {
    var numYes = 0
    val answers: List<String> = group.split("").distinct().filter { it.matches("[a-z]+".toRegex()) }
    numYes += answers.size
    return numYes
}

fun part2NumYes(group: String): Int {
    var numYes = 0
    val answerMap: MutableMap<Char, Int> = mutableMapOf()
    val groupAnswers = group.trim().split("\n".toRegex())
    for (groupAnswer in groupAnswers) {
        groupAnswer.forEach {
            answerMap.putIfAbsent(it, 0)
            answerMap[it] = answerMap[it]!! + 1
        }
        numYes += answerMap.values.filter { it == groupAnswers.size }.size
    }
    return numYes
}


fun main() {
    val input = File("day6/input.txt").readText()
    val answer1 = answer1(input)
    println("Answer 1: $answer1")

    val answer2 = answer2(input)
    println("Answer 2: $answer2")
}