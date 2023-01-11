package com.injin.me.effectivejava.chapter02.item1;

public class Item1Main {
    public static void main(String[] args) {
//        Item1 item1 = new Item1(); //생성자
        Item1 staticFactoryMethod = Item1.createInstance(); //정적팩토리메서드
    }
}
