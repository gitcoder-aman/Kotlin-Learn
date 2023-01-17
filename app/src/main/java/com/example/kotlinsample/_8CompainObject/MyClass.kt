package com.example.kotlinsample._8CompainObject

class MyClass {
        var anotherInt: Int = 10  // this variable is initialize at a runtime
    companion object{
        var someInt : Int = 10   // all variable are initialize at a compile time because this is companion(static)
        fun callSum() = "This method is called"
    }

}
fun main(args : Array<String>){

    val obj = MyClass

    println("Some Int ${obj.someInt}")
    println("call Sum ${obj.callSum()}")
    println("another Int ${MyClass().anotherInt}")
}