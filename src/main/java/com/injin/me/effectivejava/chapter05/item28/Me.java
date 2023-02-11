package com.injin.me.effectivejava.chapter05.item28;

import java.util.ArrayList;
import java.util.List;

/*
1. 불변성(무공변성, invariant)
상속 관계에 상관없이 자신의 타입만 허용하는 것을 뜻한다. Kotlin 에서는 따로 지정해주지 않으면 기본적으로 모든 Generic Class 는 무공변이다. Java 에서의 <T>와 같다.
2. 공변성(covariant)
자기 자신과 자식 객체를 허용한다. Java 에서의 <? extends T>와 같다. Kotlin 에서는 out 키워드를 사용해서 이를 표시한다.
3. 반공변성(contravariant)
공변성의 반대 - 자기 자신과 부모 객체만 허용한다. Java 에서의 <? super T>와 같다. Kotlin 에서는 in 키워드를 사용해서 표현한다.
 */
public class Me {
    public static void main(String[] args) {
        //공변
        Object[] something = new String[10];
        something[0] = "jeong";
//        something[0] = 1;

        //불공변
        List<String> list = new ArrayList<>();
//        List<Object> objects = list;


        Object[] objects = new Long[1];
//        objects[0] = "타입이 달라 넣을 수 없다.";

//        List<Object> o1 = new ArrayList<Long>(); //호환되지 않는 타입이다.
//        o1.add("타입이 달라 넣을 수 없다.");

    }
}
