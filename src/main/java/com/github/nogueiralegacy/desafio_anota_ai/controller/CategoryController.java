package com.github.nogueiralegacy.desafio_anota_ai.controller;

import com.github.nogueiralegacy.desafio_anota_ai.domain.category.Category;
import com.github.nogueiralegacy.desafio_anota_ai.domain.category.CategoryDTO;
import com.github.nogueiralegacy.desafio_anota_ai.service.CategoryService;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Category> insert(@RequestBody CategoryDTO categoryData) {
        Category newCategory = this.service.insert(categoryData);
        return ResponseEntity.ok().body(newCategory);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        List<Category> categories = this.service.getAll();
        return ResponseEntity.ok().body(categories);
    }
}
