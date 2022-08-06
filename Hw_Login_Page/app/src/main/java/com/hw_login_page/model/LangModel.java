package com.hw_login_page.model;

public class LangModel {
    String strLang;
    int imglang;
    public LangModel(String strLang, int imglang) {
        this.strLang = strLang;
        this.imglang = imglang;
    }

    public String getStrLang() {
        return strLang;
    }

    public void setStrLang(String strLang) {
        this.strLang = strLang;
    }

    public int getImglang() {
        return imglang;
    }

    public void setImglang(int imglang) {
        this.imglang = imglang;
    }
}
