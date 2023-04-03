package com.example.minitest.fomat;

import com.example.minitest.model.Picture;
import com.example.minitest.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PictureFormatter implements Formatter<Picture> {
    private IPictureService iPictureService;

    @Override
    public Picture parse(String text, Locale locale) throws ParseException {
        return iPictureService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Picture object, Locale locale) {
        return null;
    }

    public PictureFormatter(IPictureService iPictureService) {
        this.iPictureService = iPictureService;
    }
}
