package com.phoenix.BillingSoftware.service;

import com.phoenix.BillingSoftware.io.CategoryRequest;
import com.phoenix.BillingSoftware.io.CategoryResponse;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
}
