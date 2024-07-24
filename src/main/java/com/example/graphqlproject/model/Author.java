package com.example.graphqlproject.model;

import java.util.*;

public record Author(Integer id, String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1,"luka"),
            new Author(2,"vako"),
            new Author(3,"nika")
    );
    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(author -> Objects.equals(author.id(), id)).findFirst();
    }
}
