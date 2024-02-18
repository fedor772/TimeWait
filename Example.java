package com.fedor.timewait;
import com.fedor.time.Time;
public class Example {
    
    public static void main(String[] args) {
        Time t = new Time();
        t.Wait(2000);
        System.out.println("1 Ввод");
        t.Wait(2000);
        System.out.println("2 Ввод");
    }
    
}
