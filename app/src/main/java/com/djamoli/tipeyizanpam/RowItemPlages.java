package com.djamoli.tipeyizanpam;

/**
 * Created by Ing Djason(Admin) on 25-Aug-15.
 */
public class RowItemPlages {
    private int imageId;
    private String title;
    private String desc;

    public RowItemPlages(int imageId, String title, String desc) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + desc;
    }
}