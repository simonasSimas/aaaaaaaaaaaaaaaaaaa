package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite intervalo pradzia: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Iveskite intervalo pabaiga: ");
        int b = sc.nextInt();
        System.out.println();
        boolean x = true;
        for (int i = a; i <= b; i++) {
            if (x) {
                System.out.print("[ ");
                x = false;
                i--;
            } else if ((b - 1 == i) && (i % 2 == 0)) {
                System.out.print(i+" ]");
            } else if ((i < b) && (i % 2 == 0)) {
                System.out.print(i + ", ");

            } else if ((i == b) && (i % 2 == 0)) {
                System.out.print(i + " ]");
            }
        }
    }
}
