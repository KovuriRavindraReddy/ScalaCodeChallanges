package com.Ravindra.Scala

object functions {
  def main(args: Array[String]): Unit = {

    def max(num1: Int, num2: Int): Int = {
      if (num1 > num2) return num1
      else return num2


    }

    val maxValue = max(109, 200)
    println(maxValue)

    //is the return key word is necessary

    def max1(num11: Int, num12: Int): Int = {
      if (num11 > num12) num11
      else num12

    }

    val returnkey = max1(120, 190)
    println(returnkey)

    //is the return type is necessary in the function

    def max2(num3: Int, num4: Int) = {
      if (num3 > num4) num3
      else num4
    }

    val returnType = max2(190, 180)
    println(returnType)
    // is the return return type  is necessary, if we use the return keyword in the output

    def max3(num4: Int, num5: Int): Int = {
      if (num4 > num5) return num4
      else num5
    }

    val resultMax3 = max3(1500, 100)
    println(resultMax3)


    def square(num: Int) = num * num

    println(square(10))

    // if the method doesnot have sufficient expression
    def min(num1: Int, num2: Int) = {
      if (num1 < num2) num1

    }

    val minResult = min(20, 100)
    println(minResult)

    // if different types of datatypes are available how the resultant datatype

    def multiply(num1: Int, num2: Int) = {
      if (num1 == 1 || num2 == 1) println("this is euqal to 1 or zero")
      else num1 * num2
    }

    val outMultiply = multiply(10, 20)
    println(outMultiply)

    // is paranthesis necessary while writing the function
    def add(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    val result = add(10, 20)
    println(result)

    //write a function which takes no input and produces no output in the scala
    def greet = "Hello scala"

    println(greet)
    square(5)

  }
}
