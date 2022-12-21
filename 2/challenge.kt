package com.aalonzo.adventofcode2020.two

import java.io.File

fun answer1(): Int {
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
    var numValid = 0
    for (password in passwords) {
        println(password)
        val length = password.password.count { it == password.letter }
        if (length >= password.min && length <= password.max) {
            numValid++
        }
    }
    return numValid
}

fun answer2(): Int {

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
    var numValid = 0
    for (password in passwords) {
        var numLetter = 0
        if(password.password.get(password.min-1).equals(password.letter)){
            numLetter++
        }
        if(password.password.get(password.max-1).equals(password.letter)){
            numLetter++
        }
        if(numLetter ==1){
            numValid++
        }
    }
    return numValid
}

fun main() {
    val answer1 = answer1()
    println("Answer 1: $answer1")
//
    val answer2 = answer2()
    println("Answer 2: $answer2")
}

data class Password(val min: Int, val max: Int, val letter: Char, val password: String) {

}

