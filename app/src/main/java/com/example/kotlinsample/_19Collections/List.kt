package com.example.kotlinsample._19Collections

class List{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World!")

            //List Collections

            val aList = listOf<Any>("Raman","Ramiz",1,"Rohan",2,"Mukesh") //immutable list can not add data in runtime
            //only read operation
            println(aList)

            val mList = mutableListOf<String>("Rakesh","Mohan")

            mList.add("Ramiz")
            mList.add(1.toString())

            println(mList)

            val mAList = mutableListOf<Any>("Pawan",false)
            mAList.addAll(mList)

            println()
            println(mAList)

        }
    }
}