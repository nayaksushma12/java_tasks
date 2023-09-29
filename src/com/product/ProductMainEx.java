package com.product;

import com.product.Product;

public class ProductMainEx {
    public static void main(String[] args) {
        Product p = new Product(20, 25000);
        System.out.println(p.getId());
        p.setId(30);
        System.out.println(p.getId());
    }


}
