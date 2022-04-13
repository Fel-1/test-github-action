package com.section36.praktikum.controller;

import com.section36.praktikum.model.Author;
import com.section36.praktikum.model.Post;
import com.section36.praktikum.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    List<Author> authors() {
        log.info("Adding New Authors");

        Author author = Author.builder()
                .name("Nama Author ")
                .thumbnail("author.jpg")
                .postsId(new Long[]{1L})
                .build();

        authorRepository.save(author);

        return authorRepository.findAll();
//        List<Author> authors = new ArrayList<>();
//        authors.add(new Author(1, "author 1", "thumbnail", new int[]{1, 2}));
//        return authors;
    }

}
