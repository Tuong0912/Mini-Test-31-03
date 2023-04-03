//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.minitest.service.impl;

import com.example.minitest.model.Category;
import com.example.minitest.model.Picture;
import com.example.minitest.repository.IPictureRepository;
import com.example.minitest.service.IPictureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService implements IPictureService {
    @Autowired
    private IPictureRepository iPictureRepository;


    @Override
    public List<Picture> findAll() {
        return this.iPictureRepository.findAll();
    }

    @Override
    public Picture findById(Long id) {
        return null;
    }

    @Override
    public void save(Picture picture) {
        this.iPictureRepository.save(picture);
    }

    @Override
    public void remove(Long id) {
    }


    @Override
    public List<Picture> findByCode(int pictureCode) {
        return iPictureRepository.findByPictureCode(pictureCode);
    }

    @Override
    public List<Picture> findByCategory(Category category) {
        return iPictureRepository.findPictureByCategory(category);
    }
}
