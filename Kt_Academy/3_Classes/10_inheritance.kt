/*
 * Title: Inheritance example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(){
    val bike = Vehicle("Bike", 2)
    bike.vehicleInfo()
    val car = Car("Car", 4, "BMW", "Black")
    car.vehicleInfo()
    }

/*
 * Parent class: must use open keyword to make it inheritable
 */
open class Vehicle(val type: String, var wheels: Int){
    /*
     * Method: must use open keyword to make it inheritable
     */
    open fun vehicleInfo(){
        println("Vehicle type: $type")
        println("Number of wheels: $wheels")
    }
}

/*
 * Child class: no need to specify open keyword,
 * as it is already inherited from parent class.
 *
 * Child class can have its own properties and methods,
 * which are not present in parent class.
 *
 * Child class can override the properties and methods of parent class.
 * To override a property or method, use override keyword.
 */
class Car(type: String, wheels: Int, val model: String, val color: String): Vehicle(type, wheels){
    override fun vehicleInfo(){
        println("Vehicle type: $type")
        println("Car Model: $model")
        println("Car Color: $color")
    }
}
