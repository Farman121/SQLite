package com.afaan.sql;

import android.graphics.Bitmap;
import android.graphics.Bitmap;

public class ModelClass {
    private String ImageName;
    private Bitmap image;

    public ModelClass(String imageName, Bitmap image) {
        ImageName = imageName;
        this.image = image;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
