package com.example.kotlinsample._10SuperThisKeyword

open class Car {
    //Basic entities of car
    fun brakes() : String{
        println("Brakes")
        return "Brakes"
    }
    fun Accelerator(speed : Int) : String{
        println("Accelerator  $speed km/hr speed")
        return "Accelerator"
    }
    fun Gear(gearNo : Int) : String{
        println("Gear change $gearNo ")
        return "Gear changed"
    }
}
class Audi : Car(){
    private var carNo = 10

    init {
        println("Audi Created")
        println("step 1 : "+super.Gear(2))
        println("step 2 : "+super.Accelerator(3))
        println("step 3 : "+super.brakes())
    }

    fun interior(carNo : Int){
        println("Car No $carNo")
        println("Car No ${this.carNo}")
    }
}

fun main(){

    val audi = Audi()
    audi.interior(1234)
}