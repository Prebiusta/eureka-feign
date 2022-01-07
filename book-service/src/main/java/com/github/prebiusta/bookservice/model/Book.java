package com.github.prebiusta.bookservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private UUID id;
    private String name;
    private int pages;
    private UUID authorId;
}
