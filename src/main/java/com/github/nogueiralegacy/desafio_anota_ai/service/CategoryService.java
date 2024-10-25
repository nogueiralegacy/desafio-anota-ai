package com.github.nogueiralegacy.desafio_anota_ai.service;

import com.github.nogueiralegacy.desafio_anota_ai.domain.category.Category;
import com.github.nogueiralegacy.desafio_anota_ai.domain.category.CategoryDTO;
import com.github.nogueiralegacy.desafio_anota_ai.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category insert(CategoryDTO categoryData) {
        Category newCategory = new Category(categoryData);
        this.repository.save(newCategory);

        return newCategory;
    }

    public List<Category> getAll() {
        return this.repository.findAll();
    }

}
