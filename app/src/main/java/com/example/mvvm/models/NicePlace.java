package com.example.mvvm.models;

public class NicePlace {

    private String mTitle;
    private String mImageUrl;

    public NicePlace(String mTitle, String mImageUrl) {
        this.mTitle = mTitle;
        this.mImageUrl = mImageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
