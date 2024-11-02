package com.springcore.app.passwordgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PasswordGeneratorDemo implements CommandLineRunner {


    private PasswordGenerator passwordGenerator;

    @Autowired
    public PasswordGeneratorDemo(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    public static void main(String[] args) {
        SpringApplication.run(PasswordGeneratorDemo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
         String pass = passwordGenerator.generatePassword(7);
         System.out.println(pass);
         System.out.println(passwordGenerator.encodePassword(pass));

    }
}
