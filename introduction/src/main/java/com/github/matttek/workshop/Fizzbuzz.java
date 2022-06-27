package com.github.matttek.workshop;

public class Fizzbuzz {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 200) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println(i + " -> FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " -> Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " -> Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
