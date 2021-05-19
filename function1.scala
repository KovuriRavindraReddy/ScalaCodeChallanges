package com.Ravindra.Scala

object function1 {
  def main(args: Array[String]): Unit = {
    /*write the code in imperative style then write the code in functional programming part
    here we are taking count is a variable and getting the index of list and passing that list of index in the program
    numList(count) everytime it will change the numList(0) numList(1) numList(2) and so on until end the of the length
    of the array*/
    val numList = List(1, 2, 3, 4, 5)
    var count = 0
    while (count < numList.length) {
      println(numList(count))
      count = count + 1
    }

    //writing the code in imperative style for the summing of the list of elements
    var count1 = 0
    var sum = 0

    while (count1 < numList.length) {
      println(numList(count1))
      sum += numList(count1)
      count1 += 1
    }
    println(sum)

    //using functional style write the same code

    val numList1 = List(1, 2, 3, 4, 5, 6, 7.8, 9, 10)
    numList.foreach(println)
    numList.foreach(num => {
      println(num)
    })
    numList.foreach((num: Int) => {
      println(num)
    })
    numList.foreach(println)

    def sum1(numbers: Int*) = {
      var sum = 0
      numbers.foreach(num => sum = sum + num)
      println(sum)
    }

    val numList2 = List(10, 100, 200, 300, 400, 500)
    sum1(10, 100, 200)
    sum1(numList2: _*)
  }

}
