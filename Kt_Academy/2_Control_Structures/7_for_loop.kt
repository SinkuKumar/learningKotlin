/*
 * Title: for loop example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(args: Array<String>) {
    print("for loop up count: ")
    forLoopCountUp(1, 10)
    print("\n\nfor loop down count: ")
    forLoopCountDown(10, 1)
    print("\n\nfor loop iteration: ")
    forLoopIteration(listOf("S", "i", "n", "k", "u"))
}

fun forLoopCountUp(start: Int, end: Int) {
    for (count in start..end) {
        print(String.format("%d, ", count))
    }
}

fun forLoopCountDown(start: Int, end: Int) {
    for (count in start downTo end) {
        print(String.format("%d, ", count))
    }
}

fun forLoopIteration(items: List<String>) {
    for (item in items) {
        print(String.format("%s, ", item))
    }
}