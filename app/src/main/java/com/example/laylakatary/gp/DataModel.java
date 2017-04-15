package com.example.laylakatary.gp;

/**
 * Created by Layla Katary on 11/02/2017.
 */
public class DataModel {
    private int resId;
    private String price;
    private  String bu;
    private String edit;
    private String bu2;

    private String name;

    DataModel(String name, int resId,String price, String bu, String edit ,String bu2){
        this.name=name;
        this.resId=resId;
        this.price=price;
        this.bu=bu;
        this.edit=edit;
        this.bu2=bu2;


    }

    public void setBu2(String bu2) {
        this.bu2 = bu2;
    }

    public String getBu2() {
        return bu2;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getEdit() {
        return edit;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public String getBu() {
        return bu;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public int getResId() {
        return resId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }




}
