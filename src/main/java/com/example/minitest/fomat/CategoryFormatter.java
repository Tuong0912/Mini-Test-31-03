package com.example.minitest.fomat;

import com.example.minitest.model.Category;
import com.example.minitest.service.ICategoryService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    private ICategoryService iCategoryService;
    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return iCategoryService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return null;
    }

    public CategoryFormatter(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }
}
