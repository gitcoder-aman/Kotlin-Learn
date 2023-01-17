package com.example.kotlinsample._12Abstraction

fun main(){
    val obj = MyClass()
    println("Operator= ${obj.operator}")
    println("Name = ${obj.name}")
    println("Branch = ${obj.branch}")
    println("Square = ${obj.square(5)}")
}

interface IClass{
    var operator : String
    fun square(a:Int):Int
}
abstract class AbClass{
    var name : String = "John"
     abstract var branch : String

     fun add(a: Int, b:Int):Int{
         return a+b
     }
    abstract fun operator(a:Int, b:Int):Int
}

class MyClass : AbClass(),IClass {
    override var branch = "Computer"

    override fun operator(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }

    override var operator = "Add"
    override fun square(a: Int): Int {
       return a*a
    }

}