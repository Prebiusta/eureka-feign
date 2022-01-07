package com.github.prebiusta.authorservice.controller;

import com.github.prebiusta.authorservice.model.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AuthorController {
    @GetMapping("/get/{authorId}")
    public Author getAuthor(@PathVariable String authorId) {
        return new Author(UUID.fromString(authorId), "James S. A. Corey");
    }
}
