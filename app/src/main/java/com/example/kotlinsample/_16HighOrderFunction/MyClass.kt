package com.example.kotlinsample._16HighOrderFunction

fun main() {

//    higherOrder(printMe)
//    higherOrderAdd(add)         //passing the function
//
//    HighClass(printMe)

    higherOrderAddReturnString(add)
}
var printMe = { println("This line has been printed!") }

fun higherOrder(func :() -> Unit){
    func()
}

val add = {a : Int,b : Int -> a+b}

val retFun = {6}
val returnFun  = {a : Int, b : Int -> "The sum is: "+(a+b)}

fun higherOrderAdd(addFunc : (Int,Int)->Int) : () -> Int{
    println("The Sum is ${addFunc(5,6)}")

    return retFun

}

fun higherOrderAddReturnString(addFunc: (Int, Int) -> Int):(Int, Int)->String{
//    println("The Sum is ${addFunc(5,6)}")
    addFunc(5,6)
    return returnFun
}
class HighClass(func : () -> Unit){

}
