package com.tech.springapp.repository;

import com.tech.springapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String categoryName);

    Optional<Category> delete(Long categoryId);
}
