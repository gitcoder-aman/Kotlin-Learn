package com.example.kotlinsample._18ScopeFunctions

fun main() {
//    val user = User().apply {
//        name = "John"
//        age = 25
//        mobNo = "42353142312"
//    }
//
//    val age = with(user) {
//        println("The name of user is : $name")
//        age
//    }
//    println("The Age of user is: $age")
//
//    user.also {      //direct object call and actual value changed
//        it.name = "Android"
//        println("The name has changed!")
//    }
//    println("The name is : "+user.name)

//    val name : String ?= null
    val name : String = "John"
    name ?.let {
        println("The length of the name is : "+it.length)
        println("The name is : $it")
        println("The reversed name is : "+it.reversed())
    }

//    val user : User1 ?= null
    val user = User1()
    val msg = user?.run {
        println("The name of user is : $name")
        age
        "Run Scope Function"
    }
    println("Msg is : $msg")
}

class User {

    var name: String = ""
    var age: Int = 0
    var mobNo: String = ""
}
class User1{
    var name : String = "John"
    var age : Int = 2
    var mobNo : String = "32445243432"
}