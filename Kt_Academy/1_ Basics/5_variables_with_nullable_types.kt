/*
 * Title: Variable with null type example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */
fun main(){
    var name: String? = null
    var length: Int
    length = name?.length ?: 0      // length, If name is null, then length = 0
    println(length)
    name = "Sinku"
    println(name.length)
}

