package com.example.kotlinsample._1Classes

class HelloWorld {
    companion object{     //just like static method of java

        @JvmStatic
        fun main(args:Array<String>){
            println("Hello World!")
        }
    }
}