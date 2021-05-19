package com.Ravindra.Scala

class demo1{
  var num1=0
  var num2=0
  var num3=0
  var result=0;
  def mul (num1:Int,num2:Int): Unit ={
    result=num1*num2
  }
}
object classwithObject1 {
  def main(args: Array[String]): Unit = {

    val d = new demo1
    d.mul(10,20)
println(d.result)
    def f1()="hello scala"
   println(f1())

    def f2(){"hello world"}
    println(f2())


  }
}
