package com.aalonzo.adventofcode2020.day5

import java.io.File

fun convertBinaryToDecimal(binary: Long): Int {
    var num = binary
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}


fun answer1(input: String): Int {
    val lines = parseInput(input)
    val seatIds = getSeatIds(lines)
    return seatIds.max()
}

fun getSeatIds(lines: List<String>): List<Int> {
    val seatIds = mutableListOf<Int>()
    for (line in lines) {
        seatIds += getSeatId(line)
    }
    return seatIds
}

fun getSeatId(line: String): Int {
    val rowBin = line.map { c -> if (c == 'F') '0' else if (c == 'B') '1' else ' ' }.joinToString("").trim().toLong()
    val colBin = line.map { c -> if (c == 'L') '0' else if (c == 'R') '1' else ' ' }.joinToString("").trim().toLong()
    val row = convertBinaryToDecimal(rowBin)
    val col = convertBinaryToDecimal(colBin)
    return (row * 8) + col
}

fun answer2(input: String): Int {
    val lines = parseInput(input)
    val seatIds = getSeatIds(lines)
    for (i in seatIds.min()..seatIds.max()) {
        if (seatIds.find { it == i } == null) {
            return i
        }

    }
    return -1
}

fun parseInput(input: String): List<String> {
    return input.lines()
}

fun main() {
    val input = File("day5/input.txt").readText()
    val answer1 = answer1(input)
    println("Answer 1: $answer1")

    val answer2 = answer2(input)
    println("Answer 2: $answer2")
}