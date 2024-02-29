package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseFlag;
    private boolean toppingFlag;
    private boolean bagFlag;
    private boolean billFlag;


    public void setPrice(int price) {
        this.price = price;
    }
//
//    public Boolean getVeg() {
//        return isVeg;
//    }
//
//    public void setVeg(Boolean veg) {
//        isVeg = veg;
//    }

//    public void setBill(String bill) {
//        this.bill = bill;
//    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            setPrice(300);
            this.bill ="Base Price Of The Pizza: 300\n";
        }
        else{
            setPrice(400);
            this.bill ="Base Price Of The Pizza: 400\n";
            }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
//        if(getVeg()){
//            int priceNow = getPrice();
//            priceNow += 80;
//            setPrice(priceNow);
//        }

        if(!this.cheeseFlag) {
            this.cheeseFlag = true;
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
//        if(getVeg()){
//            int priceNow = getPrice();
//            priceNow += 70;
//            setPrice(priceNow);
//        }
        if(!this.toppingFlag) {
            this.toppingFlag = true;
            if (this.isVeg) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            }
            else{
                this.price += 120;
                this.bill +="Extra Toppings Added: 120\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
//            int priceNow = getPrice();
//            priceNow += 20;
//            setPrice(priceNow);

        if(!this.bagFlag) {
            this.bagFlag = true;
            this.price +=20;
            this.bill +="Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price+ "\n";
//        setBill(billTotal);
        return this.bill;

    }
}
