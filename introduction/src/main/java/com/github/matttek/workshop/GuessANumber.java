package com.github.matttek.workshop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        int min, max, find;
        int nb = 0;
        String input;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        if (args.length < 2) {
            min = 0;
            max = 100;
        } else {
            max = Integer.parseInt(args[2]);
            min = Integer.parseInt(args[1]);
        }
        find = rand.nextInt(max);
        while (true) {
            System.out.println("Your gess :");
            find = scan.nextInt();
            if (nb == find) {
                System.out.print("You Win");
                break;
            } else if (nb < find) {
                System.out.println("Too low");

            } else {
                System.out.println("Too high");
            }
        }
    }
}
