package com.techmonad.learning.scala3

import org.junit.Assert._
import org.junit.Test

class Test1 {
  @Test def t1(): Unit =
    assertEquals("I was compiled by dotty :)", Main.msg)
}
