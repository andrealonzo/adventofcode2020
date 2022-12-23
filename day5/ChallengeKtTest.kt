package com.aalonzo.adventofcode2020.day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class ChallengeKtTest {

    @Test
    fun answer1() {
        val expected = 357
        val input = "FBFBBFFRLR"
        val actual = getSeatId(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2() {
        val expected = 0
        val input = ""
        val actual = answer2(input)
        assertEquals(expected, actual)
    }
}