package com.kmlynk.secureops;

import org.springframework.boot.SpringApplication;

public class TestSecureopsApplication {

    public static void main(String[] args) {
        SpringApplication.from(SecureopsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
