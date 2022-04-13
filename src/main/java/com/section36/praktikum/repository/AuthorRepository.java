package com.section36.praktikum.repository;

import com.section36.praktikum.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
