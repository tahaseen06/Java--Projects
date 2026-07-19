package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testConcat() {
        DailyTasks d = new DailyTasks();
        assertEquals("Hello World", d.doStringConcat("Hello", "World"));
    }
}