package com.injin.me.effectivejava.chapter02.item1.me;

public interface HelloInterface {

    static String bye() {
        something();
        return "bye";
    }

    private static void something() {
        System.out.println("hmmmmmmm");
    }

    String hello();

    default void hi() {
        something();
        something2();
        System.out.println("hi");
    }

    private void bye2() {
        something2();
        System.out.println("bye2");
    }

    private void something2() {
        System.out.println("hmmmmmmm");
    }
}
