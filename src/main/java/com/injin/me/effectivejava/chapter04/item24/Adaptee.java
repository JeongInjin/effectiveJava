package com.injin.me.effectivejava.chapter04.item24;

interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        System.out.println("Adaptee specificRequest");
    }
}

class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.specificRequest();
    }
}

class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}