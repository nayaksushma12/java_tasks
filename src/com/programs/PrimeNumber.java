package com.programs;
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 5;
        boolean t = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("not prime");
                t = false;
            }
        }
        if (t == true) {
            System.out.println("prime number");
        }
    }
}