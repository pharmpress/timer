package com.pharmpress.timer

import org.joda.time.Duration
import org.joda.time.format.PeriodFormatterBuilder

class Timer {
  val millis = 0L

  def display:String = {
    val duration = new Duration(millis)
    val formatter = new PeriodFormatterBuilder()
      .printZeroAlways().minimumPrintedDigits(2)
      .appendHours()
      .appendSeparator(":")
      .appendMinutes()
      .appendSeparator(":")
      .appendSeconds()
      .toFormatter
    formatter.print(duration.toPeriod)
  }
}
