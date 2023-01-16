/*
 * Title: Collection processing functions example in Kotlin
 * Author: Sinku Kumar
 * Date:  Jan 16, 2023
 */

fun main(args: Array<String>) {
    // List of Person objects
    val persons = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Carol", 32),
        Person("Dave", 30),
        Person("Eve", 28),
        Person("Frank", 30),
        Person("Grace", 31),
        Person("Hank", 29),
        Person("Ivan", 32),
        Person("John", 30),
        Person("Kate", 31),
        Person("Liz", 28),
        Person("Mike", 30),
        Person("Nancy", 31),
        Person("Oscar", 32),
        Person("Paul", 30),
        Person("Queen", 31),
        Person("Rick", 29),
        Person("Steve", 32),
        Person("Tom", 30),
        Person("Uma", 31),
        Person("Vince", 28),
        Person("Will", 30),
        Person("Xena", 31),
        Person("Yuri", 32),
        Person("Zack", 30)
        )
    
    // Print total persons
    println("Total persons: ${persons.size}")    
    
    /*
     * Filter persons with age > 30
     */
    var moreThan30Years = persons.filter { it.age > 30 }
    for (person in moreThan30Years) {
        //println(person.name)
    }

    /*
     * Filter persons with age > 28 and name starts with 'A'
     */
    var moreThan28Years = persons.filter { it.age > 28 }
    var startsWithA = moreThan28Years.filter { it.name.startsWith("A") }
    var moreThan28YearsStartsWithA = persons.filter { it.age > 28 && it.name.startsWith("A") }
    for (person in moreThan28YearsStartsWithA) {
        println(person.name)
    }

    /*
     * Sort by descending name
     */
    var sortedByDescendingName = persons.sortedByDescending { it.name }
    for (person in sortedByDescendingName) {
        println(person.name)
    }
    
    /*
     * Take first 5 persons
     */
    var first5Persons = persons.take(5)

    /*
     * Take last 5 persons
     */
    var last5Persons = persons.takeLast(5)

    /*
     * Take persons from 5 to 10
     */
    var personsFrom5To10 = persons.slice(5..10)
    
    /*
     * Sort by name and then age
     */
    var sortedByNameThenAge = persons.sortedWith(compareBy({it.name}, {it.age}))

    /*
     * Group by age
     */
    var groupedByAge = persons.groupBy { it.age }
    for (age in groupedByAge.keys) {
        println("Age: $age")
        for (person in groupedByAge[age]!!) {
            println(person.name)
        }
    }

    /*
     * Group by age and then sort by name
     */
    var groupedByAgeThenSortedByName = persons.groupBy { it.age }.mapValues { it.value.sortedBy { it.name } }

    /*
     * Group by age and then sort by name and then take first 3
     */
    var groupedByAgeThenSortedByNameThenTakeFirst3 = persons.groupBy { it.age }.mapValues { it.value.sortedBy { it.name }.take(3) }

    /*
     * Generate sequence of numbers and perform important operations
     */
    var sequenceOfNumbers2 = generateSequence(1) { it + 1 }
    
    // filter even numbers
    var first100EvenNumbers = sequenceOfNumbers2.filter { it % 2 == 0 }.take(100)

    // map to string
    var first100EvenNumbersAsString = first100EvenNumbers.map { it.toString() }

    // flatMap to list of characters
    var first100EvenNumbersAsListOfCharacters = first100EvenNumbers.flatMap { it.toString().toList() }

    // fold to sum
    var sumOfFirst100EvenNumbers = first100EvenNumbers.fold(0) { acc, i -> acc + i }

    // reduce to sum
    var sumOfFirst100EvenNumbers2 = first100EvenNumbers.reduce { acc, i -> acc + i }

    // sum
    var sumOfFirst100EvenNumbers3 = first100EvenNumbers.sum()

    // average
    var averageOfFirst100EvenNumbers = first100EvenNumbers.average()

    // max
    var maxOfFirst100EvenNumbers = first100EvenNumbers.max()

    // maxBy
    var maxByOfFirst100EvenNumbers = first100EvenNumbers.maxBy { it % 10 }

    // min
    var minOfFirst100EvenNumbers = first100EvenNumbers.min()

    // minBy
    var minByOfFirst100EvenNumbers = first100EvenNumbers.minBy { it % 10 }

    // count
    var countOfFirst100EvenNumbers = first100EvenNumbers.count()

    // any
    var anyOfFirst100EvenNumbers = first100EvenNumbers.any { it > 100 }

    // all
    var allOfFirst100EvenNumbers = first100EvenNumbers.all { it > 100 }

    // none
    var noneOfFirst100EvenNumbers = first100EvenNumbers.none { it > 100 }

    // find
    var findOfFirst100EvenNumbers = first100EvenNumbers.find { it > 100 }

    // first
    var firstOfFirst100EvenNumbers = first100EvenNumbers.first()

    // firstBy
    var firstByOfFirst100EvenNumbers = first100EvenNumbers.first { it > 100 }

    // last
    var lastOfFirst100EvenNumbers = first100EvenNumbers.last()

    // elementAt
    var elementAtOfFirst100EvenNumbers = first100EvenNumbers.elementAt(10)

    // elementAtOrElse
    var elementAtOrElseOfFirst100EvenNumbers = first100EvenNumbers.elementAtOrElse(100) { 0 }

    // elementAtOrNull
    var elementAtOrNullOfFirst100EvenNumbers = first100EvenNumbers.elementAtOrNull(100)

    // single
    var singleOfFirst100EvenNumbers = first100EvenNumbers.single { it == 100 }

    // forEach
    first100EvenNumbers.forEach { println(it) }

    // forEachIndexed
    first100EvenNumbers.forEachIndexed { index, i -> println("Index: $index, Value: $i") }

    // onEach
    var onEachOfFirst100EvenNumbers = first100EvenNumbers.onEach { println(it) }

    // partition
    var partitionOfFirst100EvenNumbers = first100EvenNumbers.partition { it % 2 == 0 }

    // associate
    var associateOfFirst100EvenNumbers = first100EvenNumbers.associate { Pair(it, it.toString()) }

    // associateBy
    var associateByOfFirst100EvenNumbers = first100EvenNumbers.associateBy { it % 10 }

    // associateWith
    var associateWithOfFirst100EvenNumbers = first100EvenNumbers.associateWith { it.toString() }

    // groupBy
    var groupByOfFirst100EvenNumbers = first100EvenNumbers.groupBy { it % 10 }

    // distinct
    var distinctOfFirst100EvenNumbers = first100EvenNumbers.distinct()

    // distinctBy
    var distinctByOfFirst100EvenNumbers = first100EvenNumbers.distinctBy { it % 10 }

    // union
    var unionOfFirst100EvenNumbers = first100EvenNumbers.union(first100EvenNumbers)

    // intersect
    var intersectOfFirst100EvenNumbers = first100EvenNumbers.intersect(first100EvenNumbers)

    // subtract
    var subtractOfFirst100EvenNumbers = first100EvenNumbers.subtract(first100EvenNumbers)

    // zip
    var zipOfFirst100EvenNumbers = first100EvenNumbers.zip(first100EvenNumbers)

    // zipWithNext
    var zipWithNextOfFirst100EvenNumbers = first100EvenNumbers.zipWithNext()

}
 
class Person(val name: String, val age: Int){

}
