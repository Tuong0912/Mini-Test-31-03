//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.minitest.service;

import com.example.minitest.model.Category;
import com.example.minitest.model.Picture;
import com.example.minitest.service.core.IGeneralService;

import java.util.List;


public interface IPictureService extends IGeneralService<Picture> {

    List<Picture> findByCode(int pictureCode);
    List<Picture> findByCategory(Category category);
}
