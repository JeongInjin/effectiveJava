package com.injin.me.effectivejava.chapter05.item30;

import java.util.HashSet;
import java.util.Set;

// 제네릭 union 메서드와 테스트 프로그램 (177쪽)
public class Union {

    public static Set union1(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 코드 30-2 제네릭 메서드 (177쪽)
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // 코드 30-3 제네릭 메서드를 활용하는 간단한 프로그램 (177쪽)
    public static void main(String[] args) {
        Set guys = Set.of("톰", "딕", "해리");
        Set stooges = Set.of("래리", "모에", "컬리");
        Set aflCio = union2(guys, stooges);
//        Set<String> guys = Set.of("톰", "딕", "해리");
//        Set<String> stooges = Set.of("래리", "모에", "컬리");
//        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);
    }
}
