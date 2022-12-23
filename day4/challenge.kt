package com.aalonzo.adventofcode2020.day4

import java.io.File

fun answer(input: String, isValid: (MutableMap<String, String>) -> Boolean): Int {
    val lines = parseInput(input)
    val passport = mutableMapOf<String, String>()
    var numValid = 0
    for (line in lines) {
        if (line.equals("")) {
            if (isValid(passport)) {
                numValid++
            }
            passport.clear()
        } else {
            val entries = line.split(" ")
            for (entry in entries) {
                val item = entry.split(":")
                passport[item[0]] = item[1]
            }
        }
    }
    if (isValid(passport)) {
        numValid++
    }
    return numValid
}

fun answer1(input: String): Int {
    return answer(input,::isValidPart1)
}

fun answer2(input: String): Int {
    return answer(input,::isValidPart2)
}

fun parseInput(input: String): List<String> {
    return input.lines()
}

fun isValidPart1(passport: MutableMap<String, String>): Boolean {
    return passport.contains("byr") &&
            passport.contains("iyr") &&
            passport.contains("eyr") &&
            passport.contains("hgt") &&
            passport.contains("hcl") &&
            passport.contains("ecl") &&
            passport.contains("pid")
}


fun isValidPart2(passport: MutableMap<String, String>): Boolean {
    val byr = passport["byr"]?.toInt() ?: return false
    if (byr !in 1920..2022) {
        return false
    }
    val iyr = passport["iyr"]?.toInt() ?: return false
    if (iyr !in 2010..2020) {
        return false
    }
    val eyr = passport["eyr"]?.toInt() ?: return false
    if (eyr !in 2020..2030) {
        return false
    }
    val hgt = passport["hgt"] ?: return false
    if (hgt.matches("[0-9]+cm".toRegex())) {
        val num = hgt.substring(0..hgt.length - 3).toInt()
        if (num !in 150..193) {
            return false
        }

    } else if (hgt.matches("[0-9]+in".toRegex())) {
        val num = hgt.substring(0..hgt.length - 3).toInt()
        if (num !in 56..76) {
            return false
        }
    } else {
        return false
    }

    val hcl = passport["hcl"] ?: return false
    if (!hcl.matches("#([0-9]|[a-f]){6}".toRegex())) {
        return false
    }

    val ecl = passport["ecl"] ?: return false
    if (!ecl.matches("(amb|blu|brn|gry|grn|hzl|oth)".toRegex())) {
        return false
    }

    val pid = passport["pid"] ?: return false
    if (!pid.matches("([0-9]){9}".toRegex())) {
        return false
    }
    return true
}

fun main() {
    val input = File("day4/input.txt").readText()
    val answer1 = answer1(input)
    println("Answer 1: $answer1")

    val answer2 = answer2(input)
    println("Answer 2: $answer2")
}