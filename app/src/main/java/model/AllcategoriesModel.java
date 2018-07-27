package model;

/**
 * Created by wolfsoft4 on 17/7/18.
 */

public class AllcategoriesModel {

    Integer foodimg1;
    String itemname,itemprice;

    public AllcategoriesModel(Integer foodimg1, String itemname, String itemprice) {
        this.foodimg1 = foodimg1;
        this.itemname = itemname;
        this.itemprice = itemprice;
    }

    public Integer getFoodimg1(){
        return foodimg1;
    }

    public void setFoodimg1(Integer foodimg1) {
        this.foodimg1 = foodimg1;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }
}
