package com.injin.me.effectivejava.chapter04.item21.me;

interface MarkerInterface {
    default void hello() {
        System.out.println("MarkerInterface.hello");
    }
}

class SuperClass {
    private void hello() {
        System.out.println("SuperClass.Hello");
    }
}

public class SubClass extends SuperClass implements MarkerInterface{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.hello();
    }
}
