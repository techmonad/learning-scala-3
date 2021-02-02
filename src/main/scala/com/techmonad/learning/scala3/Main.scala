package com.techmonad.learning.scala3

object Main {

  def main(args: Array[String]): Unit = {

    runExample("Hello world") {
      println(msg)
    }

  }

  def msg = "I was compiled by dotty :)"

  private def runExample(name: String)(f: => Unit) = {
    println(Console.MAGENTA + s"$name example:" + Console.RESET)
    f
    println()
  }

}
