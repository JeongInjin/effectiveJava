package com.injin.me.effectivejava.chapter03.item21.me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer num : list) {
            //list.remove(num); //ConcurrentModificationException
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            //list.remove(element); //ConcurrentModificationException
            iterator.remove();
        }

        //[]
        System.out.println(list);
    }
}

