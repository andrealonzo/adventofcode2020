package com.aalonzo.adventofcode2020.one

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Challenge1Test {

    @Test
    fun answer1() {
        val expected = 514579
        val list = listOf(1721, 979, 366, 299, 675, 1456)
        val actual = answer1(list)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2() {
        val expected = 241861950
        val list = listOf(1721, 979, 366, 299, 675, 1456)
        val actual = answer2(list)
        assertEquals(expected, actual)
    }
}