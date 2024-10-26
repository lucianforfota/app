package com.springcore.app.DIclassic;

public class Main {

    public static void main(String[] args) {
        A a = new A(1);
        B b = new B(a);
        C c = new C(b);
        System.out.println(c.generateNumber());

    }
}
