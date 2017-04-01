package com.zhh.imageloadapp.model;

public class ImageModel {


    private int id;

    private String name;

    private String path;

    private String description;

    private int num;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ImageModel() {
    }

    public ImageModel(int id, String name, String path, String description, int num, double price) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.description = description;
        this.num = num;
        this.price = price;
    }


}
