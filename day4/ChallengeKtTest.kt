package com.aalonzo.adventofcode2020.day4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class ChallengeKtTest {

    @Test
    fun answer1() {
        val expected = 2
        val input = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
                "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
                "\n" +
                "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
                "hcl:#cfa07d byr:1929\n" +
                "\n" +
                "hcl:#ae17e1 iyr:2013\n" +
                "eyr:2024\n" +
                "ecl:brn pid:760753108 byr:1931\n" +
                "hgt:179cm\n" +
                "\n" +
                "hcl:#cfa07d eyr:2025 pid:166559648\n" +
                "iyr:2011 ecl:brn hgt:59in"
        val actual =answer1(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2invalid() {
        val expected = 0
        val input = "eyr:1972 cid:100\n" +
                "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\n" +
                "\n" +
                "iyr:2019\n" +
                "hcl:#602927 eyr:1967 hgt:170cm\n" +
                "ecl:grn pid:012533040 byr:1946\n" +
                "\n" +
                "hcl:dab227 iyr:2012\n" +
                "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\n" +
                "\n" +
                "hgt:59cm ecl:zzz\n" +
                "eyr:2038 hcl:74454a iyr:2023\n" +
                "pid:3556412378 byr:2007"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }

    @Test
    fun answer2valid() {
        val expected = 4
        val input =
               "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n" +
                "hcl:#623a2f\n" +
                "\n" +
                "eyr:2029 ecl:blu cid:129 byr:1989\n" +
                "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\n" +
                "\n" +
                "hcl:#888785\n" +
                "hgt:164cm byr:2001 iyr:2015 cid:88\n" +
                "pid:545766238 ecl:hzl\n" +
                "eyr:2022\n" +
                "\n" +
                "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
    @Test
    fun answer2valid1() {
        val expected = 1
        val input = "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n" +
                "hcl:#623a2f"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
    @Test
    fun answer2valid2() {
        val expected = 1
        val input =
                "eyr:2029 ecl:blu cid:129 byr:1989\n" +
                "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
    @Test
    fun answer2valid3() {
        val expected = 1
        val input =
                "hcl:#888785\n" +
                "hgt:164cm byr:2001 iyr:2015 cid:88\n" +
                "pid:545766238 ecl:hzl\n" +
                "eyr:2022"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
    @Test
    fun answer2valid4() {
        val expected = 1
        val input =
                "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719"
        val actual =answer2(input)
        assertEquals(expected, actual)
    }
}