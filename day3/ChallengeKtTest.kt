package com.aalonzo.adventofcode2020.day3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class ChallengeKtTest {

    @Test
    fun answer1() {
        val expected = 7
        val input = "..##.......\n" +
                "#...#...#..\n" +
                ".#....#..#.\n" +
                "..#.#...#.#\n" +
                ".#...##..#.\n" +
                "..#.##.....\n" +
                ".#.#.#....#\n" +
                ".#........#\n" +
                "#.##...#...\n" +
                "#...##....#\n" +
                ".#..#...#.#"
        val actual =answer1(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2() {
        val expected = 336
        val input = "..##.......\n" +
                "#...#...#..\n" +
                ".#....#..#.\n" +
                "..#.#...#.#\n" +
                ".#...##..#.\n" +
                "..#.##.....\n" +
                ".#.#.#....#\n" +
                ".#........#\n" +
                "#.##...#...\n" +
                "#...##....#\n" +
                ".#..#...#.#"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
}