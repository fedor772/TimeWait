package com.fedor.time;
public class Time {
    public void Wait(int time) {
    try {
    Thread.sleep(time);
} catch (InterruptedException e) {
    e.printStackTrace();
}
    }
}
