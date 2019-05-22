package com.greenfox.lucia.daythree;

import com.greenfox.lucia.daythree.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaythreeApplication implements CommandLineRunner {

    private Printer printer;

    @Autowired
    DaythreeApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DaythreeApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        printer.log("fuck you");
    }
}
