package com.springcore.app.passwordgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {

    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public PasswordGenerator(BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private static final String characters = "abcdefghijklmnopqrstuvwxyz";

    public String generatePassword(int length){
        String s = "";
        for (int i = 0; i < length; i++) {
            //generam random un caracter din charaters
            Random random = new Random();
            char randomCharacter = characters.charAt(random.nextInt(characters.length()));
            //adaugam caracterul al s
            s+=randomCharacter;
        }
        return s;
    }

    public String encodePassword(String password){
        return passwordEncoder.encode(password);

    }
}
