package com.example.graphqlproject;

import com.example.graphqlproject.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(BookController.class)
public class BookControllerTest {
    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void canGetBooks(){
        graphQlTester
                .documentName("books")
                .execute()
                .path("books")
                .entityList(Book.class)
                .hasSize(4);
    }
}
