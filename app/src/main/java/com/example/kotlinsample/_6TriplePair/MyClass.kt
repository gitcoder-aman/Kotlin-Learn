package com.example.kotlinsample._6TriplePair

class MyClass {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){

            val (a,b) = Pair("A",1)

            println("$a $b")

            val name = Pair("Android",true)

            println("name : ${name.first} ${name.second}")

            val str = Pair("Aman",Pair("Ramanujan",Pair("Raman",1)))

            println("${str.first} ${str.second.second.first}")

            //triple pare
            val (x,y,z) = Triple("1","Java","Kotlin")
            val tripleStr1 = Triple("1","Java","Kotlin")
            val tripleStr2 = Triple("1","Java",Triple(1,Triple("A","B",true),"C++"))

            println("$x,$y,$z")
            println("$tripleStr1")
            println("$tripleStr2")
            println("${tripleStr2.third}")
        }
    }
}