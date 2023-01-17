package com.example.kotlinsample._19Collections

class ArrayList {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            val arrNames = ArrayList<String>()

            arrNames.add("A")
            arrNames.add("B")
            arrNames.add("C")
            arrNames.add("D")

            arrNames[0] = "Raman"

            arrNames.remove("B")
//            arrNames.removeAt(1) //delete data through at index


            println(arrNames)
        }
    }
}