package com.aalonzo.adventofcode2020

import java.io.File

fun answer1(list: List<Int>): Int {
    for (i in 0 until list.size -1) {
        for (j in i + 1 until list.size) {
            if (list[i] + list[j] == 2020) {
                return list[i] * list[j]
            }
        }
    }
    return -1
}
fun main() {
    val list = File("./1/input.txt").readLines().map { it.toInt() }

    val answer1 = answer1(list)
    println("Answer 1: ${answer1}")

}

