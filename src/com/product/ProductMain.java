package com.product;

public class ProductMain {
    Product[] productArray = new Product[5];

    void printArray(){
        for(Product p: productArray){
            System.out.println(p);
        }
    }

    Product findProductById(int searchId){
        for(int i=0; i<productArray.length; i++){
            Product p = productArray[i];
            if(searchId == p.getId()){
                return p;
            }
        }
        return null;
    }

    void increasePrice(int id, double amount){
        for(int i=0; i<productArray.length; i++){
            Product p = productArray[i];
            if(p.getId()==id) {
                p.increasePriceBy(amount);
                System.out.println("increased price: " + p);
                break;
            }
        }
    }


    public static void main(String[] args) {
        ProductMain p = new ProductMain();

        p.productArray[0]= new Product(1, 10000);
        p.productArray[1] = new Product(2, 25000);
        p.productArray[2] = new Product(3, 75000);
        p.productArray[3] = new Product(4, 5000);
        p.productArray[4] = new Product(5, 35000);

        int searchId=2;

        p.printArray();
        System.out.println(p.findProductById( searchId));
        p.increasePrice(searchId, 10000);

    }
}
