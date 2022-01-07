package com.github.prebiusta.feignclient.controller;

import com.github.prebiusta.feignclient.client.BookServiceClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final BookServiceClient bookServiceClient;

    public HomeController(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("book", bookServiceClient.getBook());
        return "home";
    }
}
