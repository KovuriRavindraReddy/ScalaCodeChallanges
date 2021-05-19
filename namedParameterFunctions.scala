package com.Ravindra.Scala

object namedParameterFunctions {
  def main(args: Array[String]): Unit = {
    def total(mark1: Int, mark2: Int, mark3: Int = 20) = {
      println(s"mark1=${mark1} mark2=${mark2} mark3=${mark3}")
      mark1 + mark2 + mark3

    }

    val marksResult = total(10, 20)
    val totalResult = total(mark2 = 20, mark1 = 30)
    println(marksResult)
    println(totalResult)

    //Lazy variables
    def x = 10
    def x2 = {
      10
    }

    def x1: Int = {
      return 10
    }

    println(x)
    println(x1)
    println(x2)

    //Function with side effects
    var total2=0
    def add(x:Int, y:Int )   ={
      total2=x+y
      "hello world"

    }
    println(add(10,20))
    println(total2)
    //Function without side effect
    def printing(x:Int,y:Int): Unit ={
      println(x+y)

    }
    printing(10,20)
      }

}
