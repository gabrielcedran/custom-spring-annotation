package br.com.cedran.web;

import br.com.cedran.annotation.EnableAOP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAOP
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
