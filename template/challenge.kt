package com.aalonzo.adventofcode2020.template

import java.io.File


fun answer1(input: String): Int {
    return 1
}

fun answer2(input: String): Int {
    return 1
}

fun parseInput(input: String): List<String> {
    return input.lines()
}

fun main() {
    val input = File("template/input.txt").readText()
    val answer1 = answer1(input)
    println("Answer 1: $answer1")

    val answer2 = answer2(input)
    println("Answer 2: $answer2")
}