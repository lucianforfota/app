package com.springcore.app.DIclassic;

public class C {

    private B b;

    public C(B b) {
        this.b = b;
    }

    public int generateNumber(){
        return b.generateNumber() + 2;
    }
}
