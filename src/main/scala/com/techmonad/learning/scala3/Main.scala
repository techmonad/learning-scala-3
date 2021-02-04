package com.techmonad.learning.scala3

import com.techmonad.learning.scala3.newtypes.IntersectionTypes

object Main {

  def main(args: Array[String]): Unit = {
    runExample("Intersection Types")(IntersectionTypes.test)
  }

  private def runExample(name: String)(f: => Unit) = {
    println(Console.MAGENTA + s"$name examples: " + Console.RESET)
    f
  }

}
