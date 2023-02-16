package com.injin.me.effectivejava.chapter05.item32.me;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalExample implements Runnable {
//    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmm");

//    private static final ThreadLocal<SimpleDateFormat> format = new ThreadLocal<>() {
//        @Override
//        protected SimpleDateFormat initialValue() {
//            return new SimpleDateFormat("yyyyMMdd HHmm");
//        }
//    };

    //lambda
    private static final ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));


    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample thread = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(thread, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
//        System.out.println("Thread name = " + Thread.currentThread().getName() + " default Format = " + format.toPattern());
        System.out.println("Thread name = " + Thread.currentThread().getName() + " default Format = " + format.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        format = new SimpleDateFormat();
        format.set(new SimpleDateFormat());
//        System.out.println("Thread name = " + Thread.currentThread().getName() + " Format = " + format.toPattern());
        System.out.println("Thread name = " + Thread.currentThread().getName() + " Format = " + format.get().toPattern());
    }
}
