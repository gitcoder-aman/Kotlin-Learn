package com.example.kotlinsample._4conditional

class MyClass{
    companion object{

        @JvmStatic
        fun main(args : Array<String>){

            var num = 11;

            if (num > 100){
                println("No is Greater")
            }else{
                println("No is Smaller")
            }

            var msg = "";

            msg = if(num > 100) "No is Greater" else "No is Smaller"
            println(msg)

            if(num > 1){

            }else if(num == 100){

            }else if(num == 70){

            }

            when(num){

                1 -> {
                    println("one")
                }
                100 -> {
                    println("Hundred")
                }
            }

            //conditional when
            when{
                num > 100 -> {
                    println("No is greater than hundred.")
                }
                num < 100 ->{
                    println("No is less than hundred")
                }
                num == 100 ->{
                    println("No is equal to hundred")
                }
            }

        }
    }
}