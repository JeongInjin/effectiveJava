package com.injin.me.effectivejava.chapter03.item20.me;

interface Router {
    void connect();
    void disconnect();
}

public abstract class AbstrackRouter implements Router {
    @Override
    public void connect() {
        System.out.println("connect...");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect...");
    }

    public void abstractConnect() {
        System.out.println("abstractConnect");
    }

}

class WifiRouter extends AbstrackRouter {
    @Override
    public void connect() {
        super.connect();
        System.out.println("wifi connect...");
    }
}

class EthernetRouter extends AbstrackRouter {
  // EthernetRouter 특정 구현 추가...
}