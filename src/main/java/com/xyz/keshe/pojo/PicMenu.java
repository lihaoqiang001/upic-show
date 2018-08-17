package com.xyz.keshe.pojo;

public class PicMenu {
    private Integer mId;

    private String mTwo;

    private String mOne;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTwo() {
        return mTwo;
    }

    public void setmTwo(String mTwo) {
        this.mTwo = mTwo == null ? null : mTwo.trim();
    }

    public String getmOne() {
        return mOne;
    }

    public void setmOne(String mOne) {
        this.mOne = mOne == null ? null : mOne.trim();
    }
}