/*
 * Title: Primary constructor example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(){
    val person = Person("Sinku", 22)
    person.printDetails()
    }

/*
 * Primary constructor, var and val can be used as parameter type.
 */
class Person(val name: String, var age: Int){
    fun printDetails(){
        println("Name: $name, Age: $age")
    }
}