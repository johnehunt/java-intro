package com.midmarsh.threading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    public static void main(String[] args) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            public void run() {
                String timeStr = dateFormat.format(new Date());
                System.out.println(timeStr);
            }
        };
        t.scheduleAtFixedRate(tt, 0, 1000); // every second from now

    }

}
