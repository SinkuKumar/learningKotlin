/*
 * Title: when expression example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(args: Array<String>) {
    println(result(10))
    println(result(8))
    println(result(6))
    println(result(11))
    println(typeCheck("Hello"))
    println(typeCheck(10))
    println(typeCheck(10.5))
    println(typeCheck(10.5f))
    println(numberCheck(10))
    println(numberCheck(-10))
    println(numberCheck(0))
}

/*
 * when expression: Equality check, multiple values check, range check, default
 */
fun result(score: Int): String {
    return when (score) {
        10 -> "Top 1%"          // Equality check
        7, 8, 9 -> "Top 30%"    // Multiple values check
        5, 6 -> "Pass"
        in 0..4 -> "Fail"       // Range check
        else -> "Invalid score" // Default
    }
}

/*
 * when expression: type check
 */
fun typeCheck(obj: Any): String {
    return when (obj) {
        is String -> "String"
        is Int -> "Int"
        is Double -> "Double"
        else -> "Unknown"
    }
}

/*
 * when expression: comparison check
 */
fun numberCheck(num: Int): String {
    return when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
}