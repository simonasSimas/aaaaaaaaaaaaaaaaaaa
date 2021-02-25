package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Iveskite intervalo pradzia: ");
//        int a = sc.nextInt();
//        System.out.println();
//        System.out.print("Iveskite intervalo pabaiga: ");
//        int b = sc.nextInt();
//        System.out.println();
//        boolean x = true;
//        for (int i = a; i <= b; i++) {
//            if (x) {
//                System.out.print("[ ");
//                x = false;
//                i--;
//            } else if ((b - 1 == i) && (i % 2 == 0)) {
//                System.out.print(i+" ]");
//            } else if ((i < b) && (i % 2 == 0)) {
//                System.out.print(i + ", ");
//
//            } else if ((i == b) && (i % 2 == 0)) {
//                System.out.print(i + " ]");
//            }
//        }
        Scanner sc = new Scanner(System.in);
        boolean darboDiena = false;
        boolean atostogos = false;
        System.out.println("Ar tai darbo diena? (Y/N) : ");
        String darboDienaString = sc.nextLine();
        System.out.println("Ar jums atostogos? (Y/N) : ");
        String atostogosString = sc.nextLine();
        if (darboDienaString.equals("Y")){
            darboDiena = true;
        }
        if (atostogosString.equals("Y")){
            atostogos=true;
        }
        if (darboDienaString.equals("N")){
            darboDiena = false;
        }
        if (atostogosString.equals("N")){
            atostogos=false;
        }
        if (darboDiena){
            if (atostogos){
                System.out.println("Galima miegoti");
            } else {
                System.out.println("Negalima miegoti");
            }
        }else {
            System.out.println("Galima miegoti");
        }
    }
}
