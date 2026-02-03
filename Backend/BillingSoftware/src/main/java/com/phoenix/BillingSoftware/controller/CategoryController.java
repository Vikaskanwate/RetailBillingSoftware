package com.phoenix.BillingSoftware.controller;

import com.phoenix.BillingSoftware.io.CategoryRequest;
import com.phoenix.BillingSoftware.io.CategoryResponse;
import com.phoenix.BillingSoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private  final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory (@RequestBody CategoryRequest request){
        return categoryService.add(request);
    }
}
