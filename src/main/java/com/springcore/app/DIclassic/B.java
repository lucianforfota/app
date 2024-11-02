package com.springcore.app.DIclassic;

public class B {

    private A a;

    public B(A a){

        this.a = a;
    }

    public int generateNumber(){
        return a.generateNumber() + 1;
    }

}
