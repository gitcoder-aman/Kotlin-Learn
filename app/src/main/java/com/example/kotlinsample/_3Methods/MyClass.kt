package com.example.kotlinsample._3Methods

class MyClass{

    companion object{

        @JvmStatic
        fun main(arg : Array<String>){
            println("Hello World!")
            println("The Sum is : ${fun4(5,6)}")
            println("The Sum is : ${fun4(5,6,2)}")
        }

        fun fun1(){       //this type of method is void return

        }
        fun fun2() : Int {    //this type of method is return int value

            return 0;
        }

        fun fun3() : Any{  //this type of method is any type of value return

            return 0;
//            return "a"
//            return 2.0;
//            return true;
        }

         private fun fun4(a : Int, b : Int) : Int{         //this type of method is pass any value

            return a+b;
        }

        private fun fun4(a : Int, b : Int,c : Int) : Int{         //method overloading or compile time polymorphism

            return a+b+c;
        }

    }
}