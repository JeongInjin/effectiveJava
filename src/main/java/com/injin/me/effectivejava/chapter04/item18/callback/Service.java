package com.injin.me.effectivejava.chapter04.item18.callback;

public class Service {

    public void run(FunctionCall functionCall) {
        System.out.println("일 하는 중...");
        functionCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction bobFunction = new BobFunction(service);
        BobFunctionWrapper bobFunctionWrapper = new BobFunctionWrapper(bobFunction);
        bobFunction.run();
        System.out.println("======================");
        bobFunctionWrapper.run();
    }
}
