package com.aalonzo.adventofcode2020.day2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class ChallengeKtTest {

    @Test
    fun answer1() {
        val expected = 2
        val input = "1-3 a: abcde\n" +
                "1-3 b: cdefg\n" +
                "2-9 c: ccccccccc"
        val actual =answer1(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2() {
        val expected = 1
        val input = "1-3 a: abcde\n" +
                "1-3 b: cdefg\n" +
                "2-9 c: ccccccccc"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
}