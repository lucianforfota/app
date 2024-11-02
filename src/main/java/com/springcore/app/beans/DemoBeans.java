package com.springcore.app.beans;

import com.springcore.app.AppApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoBeans implements CommandLineRunner {

    private final Customer getCustomer;
    ApplicationContext applicationContext;

    @Autowired
    public DemoBeans(ApplicationContext applicationContext, Customer getCustomer) {
        this.applicationContext = applicationContext;
        this.getCustomer = getCustomer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBeans.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(applicationContext.getBean("address1"));
//        System.out.println(applicationContext.getBean(getCustomer);
    }
}
