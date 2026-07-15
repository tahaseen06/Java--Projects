package datetimeapi;

import java.time.LocalTime;

public class TimeBefore5Hours {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        LocalTime before = now.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + now);
        System.out.println("Before 5 Hours 30 Minutes : " + before);
    }
}
