package com.pharmpress.timer

import org.junit.runner.RunWith
import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TimerTest extends FunSuite with MockFactory {

  test("initial state"){
    val timer = new Timer()
    assert(timer.display == "00:00:00")
  }

}
