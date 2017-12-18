package com.depas.examples

import scala.io.Source

object StreamExample {

  def main(args: Array[String]): Unit = {
    val fileLines = Source.fromFile("C:\\Windows\\System32\\drivers\\etc\\hosts").getLines().toList

    val linesLongUpper =
      fileLines.filter(l => l.length() > 30)
            .filter(l => l.startsWith("0.0.0.0"))
            .map(l => l.toUpperCase())

    linesLongUpper.foreach(println)

    // or using infix notation
    println("-------------------- Using infix notation ----------------------------------")

    val linesLongUpper2 = fileLines filter (_.length() > 30 ) filter (_.startsWith("0.0.0.0"))  map(_.toUpperCase)
    linesLongUpper2.foreach(println)
  }



}
