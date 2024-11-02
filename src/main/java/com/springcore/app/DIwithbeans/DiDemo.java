package com.springcore.app.DIwithbeans;

import com.springcore.app.beans.DemoBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemo implements CommandLineRunner {

    private C etc;

    @Autowired
    public DiDemo(C d) {
         //CLASIC this.etc=new C(new B(new A()));
        this.etc =d;
    }

    public static void main(String[] args) {
        SpringApplication.run(DiDemo.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(etc.generateNumber());
    }
}
