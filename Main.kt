package com.example.ahadfirstapplication


fun main() {

    // 1:Declare and initialize different Kotlin data types:
    var name:String= "Ahad"
    var age:Int = 24
    var isStudent = true


    // 2:Create and manipulate a List
    val pets = listOf("Cat","Dog","Gold Fish")
    print("$name has "+pets.size + " pets: ")
    for(pet in pets){
        print(pet+" ")
    }

    print("\n")
    // 3:Implement control flow using if-else expressions
    if (age>18)
    {
        println("$name is adult")
    } else {
        println("$name is still minor")
    }

    // 4:Write a function and use a lambda expression

    // Filter pets that contain the word "Cat"
    val pet = pets.filter { it.contains("Cat") } //{ it.contains("Cat") } is Lambda expression
    print("$name favorite animal is "+ pet)


}


