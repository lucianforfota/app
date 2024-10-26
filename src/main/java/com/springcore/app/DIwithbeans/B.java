package com.springcore.app.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    @Autowired
    public B(A a){
        this.a = a;
    }

    public int generateNumber(){
        return a.generateNumber() + 1;
    }

}
