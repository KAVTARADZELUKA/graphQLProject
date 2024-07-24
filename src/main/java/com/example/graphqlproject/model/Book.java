package com.example.graphqlproject.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount,Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Quran", 604,1),
            new Book(2, "Harry Potter", 700,1),
            new Book(3, "Foobar", 100,3),
            new Book(4, "Spring Boot", 344,2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(book -> Objects.equals(book.id(), id)).findFirst();
    }
}
