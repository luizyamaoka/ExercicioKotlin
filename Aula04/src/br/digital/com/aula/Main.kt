package br.digital.com.aula

fun main() {
    println("hello world")
    println(nomeCompleto("Luiz", "Yamaoka"))
    array()

    printExerciseHeader(1)
    println(greatestNumber(1, 2, 3))
    println(greatestNumber(10, 2, 3))

    printExerciseHeader(2)
    println(isDifferent("string", "string"))
    println(isDifferent("string", "string diferente"))

    printExerciseHeader(3)
    println(isEven(1))
    println(isEven(8))

    printExerciseHeader(4)
    printOddNumbers(100)

    printExerciseHeader(5)
    println(analyzeNumbers(1, 10, 5, 4)) // true
    println(analyzeNumbers(10, 1, 5, 4)) // true
    println(analyzeNumbers(10, 6, 5, 4)) // true
    println(analyzeNumbers(1, 1, 5, 4)) // false

    printExerciseHeader(6)
    printPositives(100)
}

fun nomeCompleto(nome: String, sobrenome: String): String {
    return "$nome $sobrenome"
}

fun array() {
    var lista = arrayListOf<String>()
    lista.add("1o item")
    println(lista.get(0))
}

fun printExerciseHeader(number: Int) {
    println("\n=== Exercise $number")
}

fun greatestNumber(number1: Int, number2: Int, number3: Int) :Int {
    if (number1 > number3 && number1 > number3) return number1
    if (number2 > number3) return number2
    return number3
}

fun isDifferent(string1: String, string2: String) :Boolean {
    return string1 != string2
}

fun isEven(number: Int) :Boolean {
    return number % 2 == 0
}

fun printOddNumbers(quantity: Int) {
    for (i in 1..quantity*2) {
        if (!isEven(i)) println(i)
    }
}

fun analyzeNumbers(numA: Int, numB: Int, numC: Int, numD: Int) :Boolean {
    if (numA > numC && numA > numD) return true
    if (numB > numC && numB > numD) return true
    return false
}

fun printPositives(quantity: Int) {
    for (i in 1..quantity) println(i)
}