package com.phoenix.BillingSoftware.service;

import com.phoenix.BillingSoftware.io.CategoryRequest;
import com.phoenix.BillingSoftware.io.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
    List<CategoryResponse> read();
}
