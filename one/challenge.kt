package com.aalonzo.adventofcode2020.one

import java.io.File

fun answer1(list: List<Int>): Int {
    for (i in 0 until list.size - 1) {
        for (j in i + 1 until list.size) {
            if (list[i] + list[j] == 2020) {
                return list[i] * list[j]
            }
        }
    }
    return -1
}

fun answer2(list: List<Int>): Int {
    for (i in 0 until list.size - 2) {
        for (j in i + 1 until list.size - 1) {
            for (k in i + 2 until list.size) {
                if (list[i] + list[j] + list[k] == 2020) {
                    return list[i] * list[j] * list[k]
                }
            }
        }
    }
    return -1
}

fun main() {
    val list = File("one/input.txt").readLines().map { it.toInt() }

    val answer1 = answer1(list)
    println("Answer 1: $answer1")

    val answer2 = answer2(list)
    println("Answer 2: $answer2")
}

