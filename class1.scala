package com.Ravindra.Scala

object class1 {
  def main(args: Array[String]): Unit = {
    val v:Any=display()
    println(v.isInstanceOf[Object])
  }
def display():Any ={
  val num=10
  if (num ==10) "10"

}
}
