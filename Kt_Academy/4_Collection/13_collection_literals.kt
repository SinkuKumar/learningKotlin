/*
 * Title: Collection literals example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 16, 2023
 */

fun main(args: Array<String>) {
    // List literal
    val list = listOf(1, 2, 3, 4, 5)
    println(list)

    // Mutable list literal
    val mutableList = mutableListOf('A', 'B', 'C', 'D', 'E')
    println(mutableList)

    // Set literal
    val set = setOf('A', 'B', 'C', 'D', 'E')
    println(set)

    // Mutable set literal
    val mutableSet = mutableSetOf(1, 2, 3, 4, 5)
    println(mutableSet)

    // Array literal
    val array = arrayOf(1, 2, 3, 4, 5)
    println(array)


    // Map literal
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(map)

    // Mutable map literal
    val mutableMap = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(mutableMap)

    // Array literal with type, applicable to any type, not just Int.
    // This is useful when the array is empty.
    val arrayWithType = arrayOf<Int>(1, 2, 3, 4, 5)
    println(arrayWithType)

    // Array literal with size, applicable to any type, not just Int.
    // This is useful when the array is empty.
    val arrayWithSize = Array(5) { 0 }
    println(arrayWithSize)
}