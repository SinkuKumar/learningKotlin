/*
 * Title: Properties with assessors example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(){
    val car = Car("BMW", "X5")
    car.price = 100000
    println("Car price: ${car.price}")
    }

class Car(val manufacturer: String, val model: String){
    /*
     * Property with assessors
     */
    var price: Int = 0
        get() = field
        set(value) {
            if (value > 0){
                field = value
            }
        }
}