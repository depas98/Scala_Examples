package com.depas.examples

object HelloBeer {

  def main (args: Array[String] ): Unit = {
//    var n: Int = 2
//    while( n <= 6){
//      println(s"Hello ${n} bottles of beer")
//      n += 1
//    }

    2 to 6 foreach { n => println(s"Hello ${n} bottles of beer")}

    println("############ Range using Int.to  ##################")
    2.to(6) foreach { n => println(s"Hello ${n} bottles of beer")}
  }
}

