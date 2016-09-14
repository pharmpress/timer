package com.pharmpress.timer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimerJavaTest {
    @Test
    public void initialState(){
        TimerJava timer = new TimerJava();
        assertEquals("00:00:00", timer.display());
    }
}
