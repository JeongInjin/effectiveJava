package com.injin.me.effectivejava.chapter04.item24;

public class OuterClass {
    private static int outerVariable = 20;
    private int variable = 10;
    //정적 멤버 클래스
    //독립적이며, 정적필드에 접근가능.
    static private class StaticNestedClass {
        public void accessOuterVariable() {
            System.out.println(outerVariable);
//            System.out.println(variable);
        }
    }

    //비정적 멤버 클래스
    void printNumber() {
        InnerClass innerClass = new InnerClass();
    }
    private class InnerClass {
        public void accessOuterVariable() {
            System.out.println(variable);
            System.out.println(outerVariable);
            OuterClass.this.printNumber();
        }
    }

    //익명 클래스
    public Runnable method() {
        return new Runnable() {
            public void run() {
                System.out.println(variable);
                System.out.println(outerVariable);
            }
        };
    }

    //지역 클래스
    public void method_local_inner() {
        class MethodLocalInnerClass {
            public void accessOuterVariable() {
                System.out.println(variable);
                System.out.println(outerVariable);
            }
        }
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.accessOuterVariable();
    }

    public static void main(String[] args) {
        //정적 멤버 클래스
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessOuterVariable();
        System.out.println("==============");
        //비정적 멤버 클래스
        InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.accessOuterVariable();
        System.out.println("==============");
        //익명 클래스
        OuterClass outer = new OuterClass();
        Runnable runnable = outer.method();
        runnable.run();
        System.out.println("==============");
        //지역 클래스
        OuterClass outerClass = new OuterClass();
        outerClass.method_local_inner();
    }
}