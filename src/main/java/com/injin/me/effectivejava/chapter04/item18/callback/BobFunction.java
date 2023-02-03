package com.injin.me.effectivejava.chapter04.item18.callback;

public class BobFunction implements FunctionCall {

    private Service service;

    public BobFunction(Service service) {
        this.service = service;
    }

    @Override
    public void call() {
        System.out.println("밥 먹자..");
    }

    @Override
    public void run() {
        service.run(this);
    }
}
