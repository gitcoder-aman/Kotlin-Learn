package com.example.kotlinsample._5Loops

class MyClass{

    companion object{

        @JvmStatic
        fun main(args : Array<String>){

            var num = 10

            println("print 0 to 10")
            for (i in 0..10){
                println("Number is : $i")

            }

            println("print 0 to 9")
            for (i in 0 until 10){
                println("Number is : $i")

            }
            println("print 10 to 0")
            for (i in 10 downTo 0){
                println("Number is : $i")
            }

            println("print 10 to 0 step 2")
            for (i in 10 downTo 0 step 2){
                println("Number is : $i")
            }

            //while and do while

//            while (num < 20){
//                println("Num is : $num")
//                num++;
//            }
            do {
                println("Num is : $num")
            }while (num > 10)
        }

    }
}