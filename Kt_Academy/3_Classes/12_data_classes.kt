/*
 * Title: Data classes example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 15, 2023
 */

fun main(){
    val myCar = Vehicle("Lamborghini", "White", 5000000)

    // toString() displays the data class name and its constructor properties
    println(myCar.toString())

    // copy() creates a copy of the data class
    val myCarCopy = myCar.copy(color = "Red")
    println(myCarCopy.toString())

    // equals() checks if the data classes are equal
    println(myCar.equals(myCarCopy))

    // hashCode() returns the hash code of the data class
    println(myCar.hashCode())

    // componentN() returns the value of the Nth constructor property
    println(myCar.component1())
    println(myCar.component2())
    println(myCar.component3())

    // destructuring declaration
    val (name, color, price) = myCar
    println("Destructured values, Name: $name, Color: $color, Price: $price")

}

data class Vehicle(val name: String, val color: String, val price: Int){
    // Data classes can have their own properties and methods
    fun vehicleInfo(){
        println("Vehicle name: $name")
        println("Vehicle color: $color")
        println("Vehicle price: $price")
    }
}