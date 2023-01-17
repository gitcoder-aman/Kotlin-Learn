package com.example.kotlinsample._15LambdaExpression

fun main(){
    println("Square of 2 is: "+ square(2))
    println("Square of 5 is: "+ sqr(5))

    println("The Sum is : "+ add(4,3))
    printName()
    printString("Developer")
}

val sqr : (Int) -> (Int)= {x -> x*x}  //lambda expression
val sqr1 = {x:Int -> x*x}  //you can also write this

val add : (Int,Int) -> (Int) = {x,y -> x+y}

val printName = { println("Hello , Android") }

val printString : (String) -> Unit  = { strName -> println("Hello , Android $strName") } //Unit mean return nothing

fun square(a:Int):Int{
    return  a*a
}