package com.hw_login_page.model;

public class RecModel {

   String RecData;
   String Des;
   int ImgData;



    public RecModel(String RecData, int ImgData, String Des) {

            this.ImgData = ImgData;
            this.RecData = RecData;
            this.Des = Des;
    }
    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }
    public String getRecData() {
        return RecData;
    }

    public void setRecData(String recData) {
        RecData = recData;
    }

    public int getImgData() {
        return ImgData;
    }

    public void setImgData(int imgData) {
        ImgData = imgData;
    }
}
