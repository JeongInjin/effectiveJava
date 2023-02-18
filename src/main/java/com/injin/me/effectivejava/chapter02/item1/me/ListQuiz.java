package com.injin.me.effectivejava.chapter02.item1.me;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(50);
        numbers.add(25);
        numbers.add(1);

        System.out.println(numbers);
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

//        Collections.sort(numbers, desc);
        numbers.sort(desc);
        System.out.println("numbers = " + numbers);

//        Collections.reverse(numbers);
        numbers.sort(desc.reversed());

        System.out.println("numbers = " + numbers);
    }
}
