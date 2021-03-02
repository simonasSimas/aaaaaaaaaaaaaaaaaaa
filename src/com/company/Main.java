package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite varda: ");
        String name = sc.nextLine();
        System.out.print("Iveskite pavarde: ");
        String lastName = sc.nextLine();
        System.out.println(name + " " + lastName);
    }
}
