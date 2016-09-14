package com.pharmpress.timer;

import org.joda.time.Duration;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class TimerJava {
    private long millis = 0L;

    public String display() {
        Duration duration = new Duration(millis);
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .appendMinutes()
                .appendSeparator(":")
                .appendSeconds()
                .toFormatter();
        return formatter.print(duration.toPeriod());
    }
}
