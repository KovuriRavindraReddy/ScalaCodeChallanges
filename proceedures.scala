package com.Ravindra.Scala

object proceedures {
  def main(args: Array[String]): Unit = {

    def procedure(x:String): Unit ={
      println(s"employee name is $x")
    }
    procedure("Ravindra")

    def greet(name:String)={println(s"$name is g ood boy");var x=1; x}
      greet("Ravindra")
    def greet1(name:String)=println(s"Hello $name")
    greet1("Amma")

    def wish()="hi"
    println(wish())
    println(wish)

    def getResult(avg:Float): String ={println(avg);if(avg>60) "pass" else "fail"}

    println(getResult(70))
    val (m1,m2,m3)=(60,70,80)
    println(getResult((m1+m2+m3)/3.toFloat))

  }

}
