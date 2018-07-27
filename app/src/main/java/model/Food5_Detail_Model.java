package model;

public class Food5_Detail_Model {

    Integer FoodImage_Id;


    public void setFoodImage_Id(Integer foodImage_Id) {
        FoodImage_Id = foodImage_Id;
    }

    public Food5_Detail_Model(Integer foodImage_Id) {

        FoodImage_Id = foodImage_Id;
    }

    public Integer getFoodImage_Id() {
        return FoodImage_Id;
    }
}
