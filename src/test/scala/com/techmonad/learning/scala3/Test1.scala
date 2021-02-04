package com.techmonad.learning.scala3

import org.junit.Assert._
import org.junit.Test

class Test1 {
  def msg = "I was compiled by dotty :)"
  
  @Test def t1(): Unit =
    assertEquals("I was compiled by dotty :)", msg)
}
