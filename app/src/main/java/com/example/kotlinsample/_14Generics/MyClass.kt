package com.example.kotlinsample._14Generics

fun main(){

    val genObj = MyClass<String>("John")
}
class MyClass<T>(value:T) {

    init {
        println("The value is :$value")
        check<T>(value)
    }
}
fun <T> check(text : T){
    println("Received value is : $text")
}