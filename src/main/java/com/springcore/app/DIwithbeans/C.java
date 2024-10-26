package com.springcore.app.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {

    private B b;

    @Autowired
    public C(B b) {
        this.b = b;
    }

    public int generateNumber(){
        return b.generateNumber() + 2;
    }
}
