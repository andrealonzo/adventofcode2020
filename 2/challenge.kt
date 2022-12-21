package com.aalonzo.adventofcode2020.two

import java.io.File


fun isPart1PasswordValid(password: Password): Boolean {
    val length = password.password.count { it == password.letter }
    return (length >= password.min && length <= password.max)
}

fun answer(passwords: List<Password>, isValid: (Password) -> Boolean): Int {
    var numValid = 0
    for (password in passwords) {
        if (isValid(password)) {
            numValid++
        }
    }
    return numValid
}

fun isPart2PasswordValid(password: Password): Boolean {
    var numLetter = 0
    if (password.password[password.min - 1] == password.letter) {
        numLetter++
    }
    if (password.password[password.max - 1] == password.letter) {
        numLetter++
    }
    return numLetter == 1
}

private fun parseInput(): List<Password> {
    val list = File("./2/input.txt").readLines()
    val listArr = list.map { x -> x.split(" ") }

    val passwords = listArr.map { line ->
        val minMax = line[0].split("-")
        val min = minMax[0].toInt()
        val max = minMax[1].toInt()
        val letter = line[1].split(":")[0].first()
        val password = line[2]
        Password(min, max, letter, password)
    }
    return passwords
}


fun main() {
    val passwords = parseInput()
    val answer1 = answer(passwords, ::isPart1PasswordValid)
    println("Answer 1: $answer1")

    val answer2 = answer(passwords, ::isPart2PasswordValid)
    println("Answer 2: $answer2")
}

data class Password(val min: Int, val max: Int, val letter: Char, val password: String)



