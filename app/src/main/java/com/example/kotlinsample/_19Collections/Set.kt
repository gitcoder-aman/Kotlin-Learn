package com.example.kotlinsample._19Collections

class Set {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            //Set
            val aSet = setOf<Any>("Tarun",12,"Raj","Rahul")  //this is not mutable set can not any perform in run-time
            println(aSet)

            val mSet = mutableSetOf<Any>("Raj","Rajeev",1,false)
            mSet.add(true)

            println(mSet)
        }
    }
}