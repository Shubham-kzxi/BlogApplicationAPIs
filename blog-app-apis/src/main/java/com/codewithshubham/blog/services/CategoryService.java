package com.codewithshubham.blog.services;

import java.util.List;

import com.codewithshubham.blog.payloads.CategoryDto;


public interface CategoryService {

	//create
    CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
    void deleteCategory(Integer categoryId);
	
   //get
    CategoryDto getCategory(Integer categoryId);
    
    //gel all
    List<CategoryDto> getCategories();
} 