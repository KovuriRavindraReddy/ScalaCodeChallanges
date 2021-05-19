package com.Ravindra.Scala

object recursion {
  def main(args: Array[String]): Unit = {
    //recursion
    def fact(number:Int):Int={
      if(number==1) return 1
      else number*fact(number-1)
    }
   println( fact(5))
  }
  //Nested functions

  def max3(a:Int,b:Int,c:Int)  ={
    def max2(x:Int,y:Int)=if(x>y) x else y
    max2(a,max2(b,c))
  }
println(max3(10,20,30))

  //Getting the large number out of 4 numbers

  def max(a:Int,b:Int,c:Int,d:Int)  ={
    def max(x:Int,y:Int)={if (x >y) x else y }
    max(max(a,b),max(c,d))
  }

  println(max(40,10,5,6))
  //def floor(x:Double):Double
   val v=scala.math.floor(5.2)
  val f=scala.math.floor(_)
  println(f(10.9))
  val listNumbers= List(1.2,4.5,6.7)
  println(listNumbers.map(f))
  val c=scala.math.ceil(_)
  println(listNumbers.map(c))
  val p= scala.math.pow(_,_)
  println(p(5,2))

  val max1= scala.math.max(_:Int,_:Int)
  println(max1(100,50))

}
