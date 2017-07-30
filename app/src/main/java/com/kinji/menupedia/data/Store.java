package com.kinji.menupedia.data;

import android.graphics.Bitmap;

import java.util.List;

public class Store {

    private String name, address;
    private List<Bitmap> imagesBitmap;

    public Store(String name, String address, List<Bitmap> imagesBitmap) {
        this.name = name;
        this.address = address;
        this.imagesBitmap = imagesBitmap;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Bitmap> getImagesBitmap() {
        return imagesBitmap;
    }
}