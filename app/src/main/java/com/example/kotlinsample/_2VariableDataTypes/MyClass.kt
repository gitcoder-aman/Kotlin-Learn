package com.example.kotlinsample._2VariableDataTypes

class MyClass{

    companion object{

        @JvmStatic
        fun main(args : Array<String>){

            //non-primitive datatype
            Int
            String
            Boolean
            Float
            Double
            Long
            Char
            Byte
            Short

            var a = 7     //directly know a variable is taking integer value that's called smart Kotlin.

            println("Hello World  $a");

            //Val(Value) vs Var(Variable) mean

            var b : Int    //first define variable

            b = 11      //then assign value in variable

            val str = "Hello"     //val just like final keyword of java so can not assign again in program.

            b = 7;       //here we can assign again because b variable is var type variable.
//            str = "World"  //here we found error because str variable is val type variable.
        }
    }
}