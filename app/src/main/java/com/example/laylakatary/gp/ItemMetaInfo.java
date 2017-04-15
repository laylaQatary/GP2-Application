package com.example.laylakatary.gp;

/**
 * Created by Layla Katary on 05/03/2017.
 */
public class ItemMetaInfo {

    private String imgUrl;
    private String name;
    private String price;

    public ItemMetaInfo() {
    }

    public ItemMetaInfo(String imgUrl, String name, String price) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
