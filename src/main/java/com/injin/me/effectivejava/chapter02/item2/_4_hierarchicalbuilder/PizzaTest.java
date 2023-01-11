package com.injin.me.effectivejava.chapter02.item2._4_hierarchicalbuilder;

import static com.injin.me.effectivejava.chapter02.item2._4_hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.injin.me.effectivejava.chapter02.item2._4_hierarchicalbuilder.Pizza.Topping.*;

// 계층적 빌더 사용 (21쪽)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
