package com.example;

import com.example.model.Author;
import com.example.repository.AuthorRepository;
import com.google.api.client.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

import java.io.IOException;
import java.time.LocalDateTime;

@SpringBootApplication
public class SpringRestfulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRestfulApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(AuthorRepository repository){
        return args -> {
            repository.save(new Author("Will", "Sheer", 25));
            repository.save(new Author("Andrew", "Sizemore", 25));
        };
    }

}
