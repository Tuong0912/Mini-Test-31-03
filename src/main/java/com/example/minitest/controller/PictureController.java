//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.minitest.controller;


import com.example.minitest.model.Category;
import com.example.minitest.model.Picture;
import com.example.minitest.service.ICategoryService;
import com.example.minitest.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/picture"})
public class PictureController {
    @Autowired
    private IPictureService iPictureService;
    @Autowired
    ICategoryService iCategoryService;

    @ModelAttribute("categories")
    public List<Category> showAllCategory() {
        List<Category> list = iCategoryService.findAll();
        return list;
    }

    @GetMapping
    public String showAllPicture(Model model) {
        List<Picture> pictures = this.iPictureService.findAll();
        model.addAttribute("pictures", pictures);
        return "/list";
    }

    @GetMapping({"createForm"})
    public String createForm(Model model) {
        model.addAttribute("picture", new Picture());
        return "/create";
    }

    @PostMapping({"/create"})
    public String create(@ModelAttribute Picture picture) {
        this.iPictureService.save(picture);
        return "redirect:/picture";
    }


    @GetMapping("gory")
    public String showAllCate(Model model) {
        List<Category> categories = this.iCategoryService.findAll();
        model.addAttribute("categories", categories);
        return "/list";
    }

    @GetMapping("search")
    public String searchByInput(Model model, @RequestParam("pictureCode") int pictureCode) {
        List<Picture> pictures = iPictureService.findByCode(pictureCode);
        if (pictures.isEmpty()) {
            pictures = this.iPictureService.findAll();
        }
        model.addAttribute("pictures", pictures);
        return "/list";
    }

    @GetMapping("searchCate")
    public String searchByInputCate(Model model, Category category) {
        List<Picture> pictures = iPictureService.findByCategory(category);
        model.addAttribute("pictures", pictures);
        return "/list";
    }

}
