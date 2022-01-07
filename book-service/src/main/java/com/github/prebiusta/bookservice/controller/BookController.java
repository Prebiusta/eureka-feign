package com.github.prebiusta.bookservice.controller;

import com.github.prebiusta.bookservice.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BookController {
    @GetMapping("/get")
    public Book getBook() {
        return new Book(UUID.fromString("a2092c81-1976-48e1-b476-09f742c00ac5"), "Leviathan Falls", 1132, UUID.fromString("a2092c81-1976-48e1-b476-09f742c00ac5"));
    }
}
