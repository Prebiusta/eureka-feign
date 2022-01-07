package com.github.prebiusta.feignclient.controller;

import com.github.prebiusta.feignclient.client.AuthorServiceClient;
import com.github.prebiusta.feignclient.model.Author;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AuthorController {
    private final AuthorServiceClient authorServiceClient;

    public AuthorController(AuthorServiceClient authorServiceClient) {
        this.authorServiceClient = authorServiceClient;
    }

    @GetMapping("/author/{authorId}")
    public String getAuthor(Model model, @PathVariable String authorId) {
        Author author = authorServiceClient.getAuthor(authorId);
        model.addAttribute("author", author);
        return "author";
    }
}
