/*
 * Title: if expression example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(args: Array<String>) {
    println(max(1, 2))
    println(maxSingleLine(2, 3))
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxSingleLine(a: Int, b: Int): Int = if (a > b) a else b