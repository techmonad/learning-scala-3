package com.techmonad.learning.scala3.newtypes

/**
 * Intersection Types : https://dotty.epfl.ch/docs/reference/new-types/intersection-types.html
 */
object IntersectionTypes {

  object Example1 {

    sealed trait FirstName {
      def firstName: String
    }

    sealed trait LastName {
      def lastName: String
    }

    type FullName = FirstName & LastName

    final case class Name(firstName: String, lastName: String) extends FirstName with LastName
    
    def test: Unit = {
      def fullName(name: FullName): String = s"${name.firstName} ${name.lastName}"
      
      val name = fullName(Name("Angel", "Ivana"))
      println(s"Example 1 : $name")
    }

  }

  object Example2 {
    
    sealed trait X {
      def x: Double
      def tpe: X
    }

    sealed trait Y {
      def y: Double
      def tpe: Y
    }

    type P  = Y & X
    type PP = X & Y

    final case class Point(x: Double, y: Double) extends X with Y {
      override def tpe: X & Y = ???
    }

    def test: Unit = {
      def euclideanDistance(p1: X & Y, p2: X & Y) =
        Math.sqrt(Math.pow(p2.y - p1.y, 2) + Math.pow(p2.x - p1.x, 2))

      val p1: P  = Point(3, 4)
      val p2: PP = Point(6, 8)
      val result = euclideanDistance(p1, p2)
      println(s"Example 2 : $result")
    }
    
  }
  
  object Example3 {

    trait A:
      def a = "a"

    trait B:
      def b = "b"

    trait C:
      def c = "c"

    def combine(d: A & B & C): String = s"${d.a} ${d.b} ${d.c}"
    
    def test: Unit = {
      class D extends A with B with C
      val d = new D
      val result = combine(d)
      println(s"Example 3 : $result")
    }
    
  }

  def test: Unit = {
    Example1.test
    Example2.test
    Example3.test
  }

}
