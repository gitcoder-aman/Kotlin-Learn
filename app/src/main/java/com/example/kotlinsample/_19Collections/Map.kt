package com.example.kotlinsample._19Collections

class Map {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            //Map
            val aMap = mapOf<Any,String>(1 to "Raman", 10 to "Rahul",true to "check")
            println(aMap)

            val mMap = mutableMapOf<Int,String>()

            val mAMap = mapOf<Int,String>(1 to "Raj",12 to "Rohit", 11 to "Rajeev")
            mMap.putAll(mAMap)

            mMap[1] = "Raman"  //ALl data of unmutable map to put in mutable map so can easily change the data

            println(mMap)
        }
    }
}