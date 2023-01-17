package com.example.kotlinsample._9Inheritance

open class ClassA { //parent class
   open var name = "John"

   open fun add(a : Int , b : Int) : Int{
        return a+b
    }
}
class ClassB : ClassA() {

    override var name: String = "Harry"

    override fun add(a: Int, b: Int): Int {  //method overriding
        val sum = super.add(a, b)
        return sum * sum
    }
}

fun main(){

    val objB = ClassB()
    val objA = ClassA()

    println("The name is after overriding "+objB.name)
    println("Two no are square after overriding "+objB.add(5,6))

    println("The name is  "+objA.name)
    println("Two no are add "+objA.add(5,6))
}
