package com.injin.me.effectivejava.chapter02.item1;

/**
 * 아이템1: 생성자 대신 정적 팩터리 메서드를 고려하라.
 * https://jeong0427.tistory.com/33
 */
public class Item1 {
    private Item1() {} // 생성자

    //정적 팩토리 메서드
    public static Item1 createInstance() {
        return new Item1();
    }

    public static void main(String[] args) {
//        Item1 item1 = new Item1(); //생성자
        Item1 staticFactoryMethod = Item1.createInstance(); //정적팩토리메서드
    }
}

