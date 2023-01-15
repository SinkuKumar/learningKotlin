# Learning Kotlin

Contains practice codes using the [Kt. Academy](https://kt.academy/) [CHEAT SHEET](https://kt.academy/Kotlin_Cheat_Sheet.pdf).

## Basics

1. [Hello World](./1_%20Basics/1_hello_world.kt)
   ```kotlin
   println("Hello World")
   ```
2. [Declaring function](./1_%20Basics/2_declaring_function.kt)
   ```kotlin
   fun multiply(a: Int, b: Int): Int{
        return a*b
   }
   ```
3. [Single expression function](./1_%20Basics/3_single_expression_function.kt)
   ```kotlin
   fun multiply(a: Int, b: Int) = a*b
   ```
4. [Declaring variables](./1_%20Basics/4_declaring_variables.kt)
   ```kotlin
   val dateOfBirth = "22/11/2000" // Can't be changed
   var age = "22"                 // Can be changed
   ```
5. [Variables with nullable types](./1_%20Basics/5_variables_with_nullable_types.kt)
   ```kotlin
   var address: String? = null
   ```
6. [if expression](./2_Control_Structures/6_if_expression.kt)
   ```kotlin
   if (6 > 7){
    print("6 is bigger")
   }
   ```
7. [for loop](./2_Control_Structures/7_for_loop.kt)
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
8. [when expression](2_Control_Structures/8_when_expression.kt)

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
