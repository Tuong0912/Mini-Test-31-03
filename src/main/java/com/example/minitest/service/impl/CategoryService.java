//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.minitest.service.impl;

import com.example.minitest.model.Category;
import com.example.minitest.repository.ICategoryRepository;
import com.example.minitest.service.ICategoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    public CategoryService() {
    }

    @Override
    public List<Category> findAll() {
        return this.iCategoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return iCategoryRepository.getOne(id);
    }

    @Override
    public void save(Category category) {
    }

    @Override
    public void remove(Long id) {
    }
}
