package com.example.kotlinsample._11Interface

fun main(){
    val objA = classA()
    println("The no is : "+objA.firstNumber)
    println("Two nos is add : "+objA.add(4,5))
    println("Three nos is add : "+objA.add(4,5,5))

    val objB = classB()
    println("The no is : "+objB.firstNumber)
    println("Two nos is add : "+objB.add(10,10))
    println("Three nos is add : "+objB.add(10,20,10))
}
interface add{

    var firstNumber : Int
    fun add(a : Int , b : Int) : Int
    fun add(a : Int , b : Int, c : Int) : Int
}

class classA : add{

    override var firstNumber = 12
    override fun add(a: Int, b: Int): Int {
        return a+b
    }

    override fun add(a: Int, b: Int, c: Int): Int {
        return a+b+c
    }
}
class classB : add{

    override var firstNumber: Int
        get() = 100
        set(value) {}

    override fun add(a: Int, b: Int): Int {
        return 2*(a+b)
    }

    override fun add(a: Int, b: Int, c: Int): Int {
        return 3*(a+b+c)
    }

}