# Learning Kotlin

Contains practice codes using the [Kt. Academy](https://kt.academy/) [CHEAT SHEET](https://kt.academy/Kotlin_Cheat_Sheet.pdf).

## Basics

1.  [Hello World](./1_%20Basics/1_hello_world.kt)
    ```kotlin
    println("Hello World")
    ```
2.  [Declaring function](./1_%20Basics/2_declaring_function.kt)
    ```kotlin
    fun multiply(a: Int, b: Int): Int{
         return a*b
    }
    ```
3.  [Single expression function](./1_%20Basics/3_single_expression_function.kt)
    ```kotlin
    fun multiply(a: Int, b: Int) = a*b
    ```
4.  [Declaring variables](./1_%20Basics/4_declaring_variables.kt)
    ```kotlin
    val dateOfBirth = "22/11/2000" // Can't be changed
    var age = "22"                 // Can be changed
    ```
5.  [Variables with nullable types](./1_%20Basics/5_variables_with_nullable_types.kt)
    ```kotlin
    var address: String? = null
    ```
6.  [if expression](./2_Control_Structures/6_if_expression.kt)
    ```kotlin
    if (6 > 7){
     print("6 is bigger")
    }
    ```
7.  [for loop](./2_Control_Structures/7_for_loop.kt)
    ```kotlin
    for(item in items){
         print(item)
    }
    for(count in 1..10){
         print(count)
    }
    for(count in 10 downTo 1){
         print(count)
    }
    ```
8.  [when expression](2_Control_Structures/8_when_expression.kt)

    ```kotlin
    when(score){
         10 -> "Top 1%"          // Equality check
         7, 8, 9 -> "Top 30%"    // Multiple values check
         5, 6 -> "Pass"
         in 0..4 -> "Fail"       // Range check
         else -> "Invalid score" // Default
    }
    // type check
    when (obj) {
         is String -> "String"
         is Int -> "Int"
         is Double -> "Double"
         else -> "Unknown"

     // comarision check
     when {
         num > 0 -> "Positive"
         num < 0 -> "Negative"
         else -> "Zero"
    ```

9.  [Primary constructor](./3_Classes/9_primary_constructor.kt)

    ```kotlin
    class Person(val name: String, var age: Int){

    }
    ```

10. [Inheritance](./3_Classes/10_inheritance.kt)

    ```kotlin
    open class Vehicle(val type: String, var wheels: Int){
        /*
         * Method: must use open keyword to make it inheritable
         */
        open fun vehicleInfo(){
        println("Vehicle type: $type")
        println("Number of wheels: $wheels")
        }
    }

    class Car(type: String, wheels: Int, val model: String, val color: String): Vehicle(type, wheels){
        override fun vehicleInfo(){
            println("Vehicle type: $type")
            println("Car Model: $model")
            println("Car Color: $color")
        }
    }
    ```

11. [Properties with assessors](./3_Classes/11_properties_with_assessors.kt)

    ```kotlin
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
    ```

12. [Properties with assessors](./3_Classes/11_properties_with_assessors.kt)

    ```kotlin
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
    ```
