//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.minitest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pictureCode;
    private double height;
    private double width;
    private String type;
    private String note;
    private double price;
    @ManyToOne
    private Category category;

    public Picture() {
    }

    public Picture(int pictureCode, double height, double width, String type, String note, double price, Category category) {
        this.pictureCode = pictureCode;
        this.height = height;
        this.width = width;
        this.type = type;
        this.note = note;
        this.price = price;
        this.category = category;
    }

    public Picture(Long id, int pictureCode, double height, double width, String type, String note, double price, Category category) {
        this.id = id;
        this.pictureCode = pictureCode;
        this.height = height;
        this.width = width;
        this.type = type;
        this.note = note;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPictureCode() {
        return this.pictureCode;
    }

    public void setPictureCode(int idPicture) {
        this.pictureCode = idPicture;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
