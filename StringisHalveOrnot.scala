package com.Ravindra.Scala

object StringisHalveOrnot {
  def main(args: Array[String]): Unit = {
    val s ="AEbcIebc"
    //val s ="AEbcIbc"

    def stringisHalveOrnot1(s:String): Boolean ={
      var stringfull=s.toLowerCase()
      if (stringfull.length%2==0){
        var s1=stringfull
        println(s1)
        val string1= stringfull.substring(0,stringfull.length/2)
        val string2=stringfull.substring(stringfull.length/2)
        println(string1)
        println(string2)
        val s3=string1.replaceAll("[^aeiou]","")
        val s4 =string2.replaceAll("[^aeiou]","")
        if(s3.length ==s4.length){
          return true
        } else {
          return false
        }
      } else{
        return false
      }



    }

    val result =stringisHalveOrnot1(s)
    println(result)
  }

}
