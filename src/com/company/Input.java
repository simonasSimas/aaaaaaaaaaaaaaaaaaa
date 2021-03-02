package com.company;

import java.util.Scanner;

public class Input {
    public int Input() {
        System.out.println("Iveskite sveikaji skaciu: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }
}
