package com.example.laylakatary.gp;

/**
 * Created by Layla Katary on 09/04/2017.
 */
public class Orderitem {
    String TotalString;
    String  Price;
    String Qountity  ;
    String count;
    String imgUrl;

    public Orderitem(){


    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setQountity(String qountity) {
        Qountity = qountity;
    }

    public void setTotalString(String totalString) {
        TotalString = totalString;
    }

    public String getCount() {
        return count;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPrice() {
        return Price;
    }

    public String getQountity() {
        return Qountity;
    }

    public String getTotalString() {
        return TotalString;
    }

}
