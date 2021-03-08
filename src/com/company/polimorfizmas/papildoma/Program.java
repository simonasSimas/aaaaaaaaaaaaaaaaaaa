package com.company.polimorfizmas.papildoma;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws WrongOptionException {
        Person juniorDeveloper = createPersonel(new Person());
        Person seniorDeveloper = createPersonel(new Person());
        Person midDeveloper = createPersonel(new Person());
        Person projectManager = createPersonel(new Person());
        Personel personel = new Personel();
        personel.addPersonel(juniorDeveloper);
        personel.addPersonel(seniorDeveloper);
        personel.addPersonel(midDeveloper);
        personel.addPersonel(projectManager);

        juniorDeveloper.likes(seniorDeveloper);
        System.out.println(seniorDeveloper.getLikeCount());
    }

    static Person createPersonel(Person personel) throws WrongOptionException {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Iveskite savo varda: ");
            String name = sc.nextLine();
            System.out.print("Iveskite savo pareigas (true: Developer / false: Manager): ");
            boolean qualification = sc.nextBoolean();
            personel.setQualification(qualification);
            personel.setName(name);
            return personel;
        } catch (InputMismatchException e){
            throw new WrongOptionException("You can only write true (Developer) or false (Manager) for the qualification!!");
        }

    }
}