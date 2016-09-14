package com.pharmpress.timer.acceptance

import com.pharmpress.timer.Timer
import cucumber.api.scala.{EN, ScalaDsl}

class TimerSteps extends ScalaDsl with EN{
  var timer: Timer = _

  Given("""^a new timer$"""){ () =>
    timer = new Timer
  }

  Then("""^the timer should display: (\d+:\d+:\d+)$"""){ (arg:String) =>
    assert(timer.display == arg)
  }
}
