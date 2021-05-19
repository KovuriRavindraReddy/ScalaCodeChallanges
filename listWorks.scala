package com.Ravindra.Scala

object listWorks {
  def main(args: Array[String]): Unit = {
    val numList=List(1,2,3,4,5)
    numList.foreach(println)
    for(i <- numList){
      println(i)
    }
  }

}
