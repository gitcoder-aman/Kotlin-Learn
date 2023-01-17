package com.example.kotlinsample._7ObjectsConstructor

class KotlinBasic  {
    var someInt = 10

    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

class KotlinBasic1 constructor ( a: Int) {   //constructor is also write or not //primary constructor

    init {
        println("We are getting a : $a");
    }

}

class KotlinBasic2 {

    constructor(a :Int, b:Int = 10){     //secondary constructor or custom constructor
        val sum = a+b
        println("addition of two is : $sum")

    }
    constructor(a : Int , b : Int , c : Int){
        val sum = a+b+c
        println("addition of three is : $sum")
    }

}

fun main() {
    val kb = KotlinBasic()

    println("The Integer is : " + kb.someInt)
    val add = kb.add(2, 3)
    println("Sum of two no :$add")

    KotlinBasic1(3)

    KotlinBasic2(a=2)
    KotlinBasic2(2,4,6)

}