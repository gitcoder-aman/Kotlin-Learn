package com.example.kotlinsample._13Enum

fun main() {

    println("Today is : "+Days.MONDAY)

    for(day in Days.values()){
        if(day.holiday){
            println("$day Day is Holiday")
        }
    }
}

enum class Days(val holiday : Boolean = false) {

    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}
enum class Direction{
    EAST,WEST,NORTH,SOUTH
}
enum class Gender{
    FEMALE,MALE,OTHER
}