package com.hw_login_page.model;

public class conModel {
    String ConName;
    int ImgCon;

    public String getConName() {
        return ConName;
    }

    public void setConName(String conName) {
        ConName = conName;
    }

    public int getImgCon() {
        return ImgCon;
    }

    public void setImgCon(int imgCon) {
        ImgCon = imgCon;
    }

    public conModel(String ConName, int ImgCon) {
        this.ConName = ConName;
        this.ImgCon = ImgCon;
    }
}
