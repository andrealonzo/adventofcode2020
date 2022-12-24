package com.aalonzo.adventofcode2020.day6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class ChallengeKtTest {

    @Test
    fun answer1() {
        val expected = 11
        val input = "abc\n" +
                "\n" +
                "a\n" +
                "b\n" +
                "c\n" +
                "\n" +
                "ab\n" +
                "ac\n" +
                "\n" +
                "a\n" +
                "a\n" +
                "a\n" +
                "a\n" +
                "\n" +
                "b"
        val actual =answer1(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2() {
        val expected = 6
        val input = "abc\n" +
                "\n" +
                "a\n" +
                "b\n" +
                "c\n" +
                "\n" +
                "ab\n" +
                "ac\n" +
                "\n" +
                "a\n" +
                "a\n" +
                "a\n" +
                "a\n" +
                "\n" +
                "b"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
}