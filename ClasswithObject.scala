package com.Ravindra.Scala

class demo {
  var num1 = 0
  var num2 = 0
  private var num3 = 0
  var result = 0;

  def add(num: scala.collection.mutable.ListBuffer[Int]): Int = {
    num += 15
    num.sum
  }
}

object ClasswithObject {
  def main(args: Array[String]): Unit = {

    val d = new demo
    val list = scala.collection.mutable.ListBuffer(1, 2, 3)
    val result = d.add(list)
    println(result)
    list.foreach(println)
  }

}
