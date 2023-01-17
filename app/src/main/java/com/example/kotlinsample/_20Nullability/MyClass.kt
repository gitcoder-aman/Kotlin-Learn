package com.example.kotlinsample._20Nullability

fun main() {

    var name: String? = null  // ? this question mark is define accept null value in variable

//    name = "John"
//    println("The name is $name")
//    println("length of name " + name!!.length)

    //or
    name?.let {          //when let function is execute name is not contain null
        println("length of name " + name.length)
    }
}