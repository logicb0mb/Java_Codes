package com.shreyasshukla;

abstract class SuperMarket {
    abstract void billing();
    abstract void stockAvailability();
    abstract void printSaleReport();
}

class Groceries extends SuperMarket{

    int countOfgrocerie1;
    int countOfgrocerie2;

    double priceOfgrocerie1 = 300;
    double priceOfgrocerie2 = 400;
    double totalQuantityOfgrocerie1  = 5;
    double totalQuantityOfgrocerie2 = 10;


    Groceries(int countOfgrocerie1, int countOfgrocerie2){
        this.countOfgrocerie1 = countOfgrocerie1;
        this.countOfgrocerie2 = countOfgrocerie2;
    }
    void billing() {

        priceOfgrocerie1 *= this.countOfgrocerie1;
        priceOfgrocerie2 *= this.countOfgrocerie2;

        System.out.println(countOfgrocerie1 + " items of grocerie1, costs: "+ priceOfgrocerie1);
        System.out.println(countOfgrocerie2 + " items of grocerie2, costs: "+ priceOfgrocerie2);

        System.out.println("Total: "+ (priceOfgrocerie1+priceOfgrocerie2));
    }

    void stockAvailability() {

        System.out.println("Out of "+ totalQuantityOfgrocerie1 +" grocerie1, now left in stock:"+ (totalQuantityOfgrocerie1 - this.countOfgrocerie1));
        System.out.println("Out of "+ totalQuantityOfgrocerie2 +" grocerie2, now left in stock:"+ (totalQuantityOfgrocerie2 - this.countOfgrocerie2));
    }

    void printSaleReport() {
        System.out.println("Total products:" + (totalQuantityOfgrocerie1+totalQuantityOfgrocerie2));
        System.out.println("Total products sold:"+ ((countOfgrocerie1 + countOfgrocerie2)));
        System.out.println("Total products left:"+((totalQuantityOfgrocerie2+totalQuantityOfgrocerie1) - (countOfgrocerie2+countOfgrocerie1)));
    }
}

class KitchenTools extends SuperMarket{

    int countOfkitchenTool1;
    int countOfkitchenTool2;

    double priceOfkitchenTool1 = 300;
    double priceOfkitchenTool2 = 400;
    double totalQuantityOfkitchenTool1  = 5;
    double totalQuantityOfkitchenTool2 = 10;


    KitchenTools(int countOfkitchenTool1, int countOfkitchenTool2){
        this.countOfkitchenTool1 = countOfkitchenTool1;
        this.countOfkitchenTool2 = countOfkitchenTool2;
    }
    void billing() {

        priceOfkitchenTool1 *= this.countOfkitchenTool1;
        priceOfkitchenTool2 *= this.countOfkitchenTool2;

        System.out.println(countOfkitchenTool1 + " items of kitchenTool1, costs: "+ priceOfkitchenTool1);
        System.out.println(countOfkitchenTool2 + " items of kitchenTool2, costs: "+ priceOfkitchenTool2);

        System.out.println("Total: "+ (priceOfkitchenTool1+priceOfkitchenTool2));
    }

    void stockAvailability() {

        System.out.println("Out of "+ totalQuantityOfkitchenTool1 +" kitchenTool1, now left in stock:"+ (totalQuantityOfkitchenTool1 - this.countOfkitchenTool1));
        System.out.println("Out of "+ totalQuantityOfkitchenTool2 +" kitchenTool2, now left in stock:"+ (totalQuantityOfkitchenTool2 - this.countOfkitchenTool2));
    }

    void printSaleReport() {
        System.out.println("Total products:" + (totalQuantityOfkitchenTool1+totalQuantityOfkitchenTool2));
        System.out.println("Total products sold:"+ ((countOfkitchenTool1 + countOfkitchenTool2)));
        System.out.println("Total products left:"+((totalQuantityOfkitchenTool2+totalQuantityOfkitchenTool1) - (countOfkitchenTool2+countOfkitchenTool1)));
    }
}

class snacks extends SuperMarket{

    int countOfsnack1;
    int countOfsnack2;

    double priceOfsnack1 = 300;
    double priceOfsnack2 = 400;
    double totalQuantityOfsnack1  = 5;
    double totalQuantityOfsnack2 = 10;


    snacks(int countOfsnack1, int countOfsnack2){
        this.countOfsnack1 = countOfsnack1;
        this.countOfsnack2 = countOfsnack2;
    }
    void billing() {

        priceOfsnack1 *= this.countOfsnack1;
        priceOfsnack2 *= this.countOfsnack2;

        System.out.println(countOfsnack1 + " items of snack1, costs: "+ priceOfsnack1);
        System.out.println(countOfsnack2 + " items of snack2, costs: "+ priceOfsnack2);

        System.out.println("Total: "+ (priceOfsnack1+priceOfsnack2));
    }

    void stockAvailability() {

        System.out.println("Out of "+ totalQuantityOfsnack1 +" snack1, now left in stock:"+ (totalQuantityOfsnack1 - this.countOfsnack1));
        System.out.println("Out of "+ totalQuantityOfsnack2 +" snack2, now left in stock:"+ (totalQuantityOfsnack2 - this.countOfsnack2));
    }

    void printSaleReport() {
        System.out.println("Total products:" + (totalQuantityOfsnack1+totalQuantityOfsnack2));
        System.out.println("Total products sold:"+ ((countOfsnack1 + countOfsnack2)));
        System.out.println("Total products left:"+((totalQuantityOfsnack2+totalQuantityOfsnack1) - (countOfsnack2+countOfsnack1)));
    }
}

class Cosmetics extends SuperMarket{

    int countOfCosmetic1;
    int countOfCosmetic2;

    double priceOfCosmetic1 = 300;
    double priceOfCosmetic2 = 400;
    double totalQuantityOfCosmetic1  = 5;
    double totalQuantityOfCosmetic2 = 10;


    Cosmetics(int countOfCosmetic1, int countOfCosmetic2){
        this.countOfCosmetic1 = countOfCosmetic1;
        this.countOfCosmetic2 = countOfCosmetic2;
    }
    void billing() {

        priceOfCosmetic1 *= this.countOfCosmetic1;
        priceOfCosmetic2 *= this.countOfCosmetic2;

        System.out.println(countOfCosmetic1 + " items of cosmetic1, costs: "+ priceOfCosmetic1);
        System.out.println(countOfCosmetic2 + " items of cosmetic2, costs: "+ priceOfCosmetic2);

        System.out.println("Total: "+ (priceOfCosmetic1+priceOfCosmetic2));
    }

    void stockAvailability() {

        System.out.println("Out of "+ totalQuantityOfCosmetic1 +" cosmetic1, now left in stock:"+ (totalQuantityOfCosmetic1 - this.countOfCosmetic1));
        System.out.println("Out of "+ totalQuantityOfCosmetic2 +" cosmetic2, now left in stock:"+ (totalQuantityOfCosmetic2 - this.countOfCosmetic2));
    }

    void printSaleReport() {
        System.out.println("Total products:" + (totalQuantityOfCosmetic1+totalQuantityOfCosmetic2));
        System.out.println("Total products sold:"+ ((countOfCosmetic1 + countOfCosmetic2)));
        System.out.println("Total products left:"+((totalQuantityOfCosmetic2+totalQuantityOfCosmetic1) - (countOfCosmetic2+countOfCosmetic1)));
    }
}




public class Main {

    public static void main(String[] args) {
	// superMarket
        SuperMarket sm;
        System.out.println("-------------Cosmetics---------------");
        sm = new Cosmetics(2,3);
        sm.billing();
        sm.stockAvailability();
        sm.printSaleReport();

        System.out.println("-------------KitchenTools---------------");
        sm = new KitchenTools(4,1);
        sm.billing();
        sm.stockAvailability();
        sm.printSaleReport();

        System.out.println("-------------Groceries---------------");
        sm = new Groceries(1,3);
        sm.billing();
        sm.stockAvailability();
        sm.printSaleReport();

        System.out.println("-------------Snacks---------------");
        sm = new snacks(2,7);
        sm.billing();
        sm.stockAvailability();
        sm.printSaleReport();
    }
}
