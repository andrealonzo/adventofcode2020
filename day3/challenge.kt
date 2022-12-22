package com.aalonzo.adventofcode2020.day3

import java.io.File

fun getNumTreesHit(right: Int, down: Int, numRows: Int, numCols: Int, treeRows: Set<Pair<Int, Int>>): Int {
    var c = 0
    var numTreesHit = 0
    for (r in numRows - 1 - down downTo 0 step down) {
        c = (c + right) % numCols
        if (treeRows.contains(Pair(r, c))) {
            numTreesHit++
        }
    }
    return numTreesHit
}

fun answer1(input: String): Int {
    val (numRows,numCols, treeRows) = parseInput(input)
    return getNumTreesHit(3, 1, numRows, numCols, treeRows)
}

fun answer2(input: String): Int {
    val (numRows,numCols, treeRows) = parseInput(input)
    return getNumTreesHit(1, 1, numRows, numCols, treeRows) *
            getNumTreesHit(3, 1, numRows, numCols, treeRows) *
            getNumTreesHit(5, 1, numRows, numCols, treeRows) *
            getNumTreesHit(7, 1, numRows, numCols, treeRows) *
            getNumTreesHit(1, 2, numRows, numCols, treeRows)
}

fun parseInput(input: String): TreeGrid {
    val listStr = input.lines().reversed()
    val treeRows = mutableSetOf<Pair<Int, Int>>()
    val numRows = listStr.size
    val numCols = listStr.first().length
    for (r in listStr.indices) {
        val rowArr = listStr[r].toList()
        for (c in rowArr.indices) {
            if (rowArr[c] == '#') {
                treeRows += Pair(r, c)
            }
        }
    }
    return TreeGrid(numRows,numCols, treeRows)
}

data class TreeGrid(val numRows: Int, val numCols: Int, val treeRows: Set<Pair<Int, Int>>)


fun main() {
    val input = File("day3/input.txt").readText()
    val answer1 = answer1(input)
    println("Answer 1: $answer1")

    val answer2 = answer2(input)
    println("Answer 2: $answer2")
}




