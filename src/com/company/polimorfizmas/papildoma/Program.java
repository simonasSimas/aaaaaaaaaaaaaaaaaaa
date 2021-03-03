package com.company.polimorfizmas.papildoma;

import com.company.polimorfizmas.First.Exc.A;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Person personJuniorDeveloper = createPersonel(new Person());
        Person personSeniorDeveloper = createPersonel(new Person());
        Person personMidDeveloper = createPersonel(new Person());
        Person personProjectManager = createPersonel(new Person());

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(personJuniorDeveloper);
        personList.add(personMidDeveloper);
        personList.add(personProjectManager);
        personList.add(personSeniorDeveloper);

        personJuniorDeveloper.likes(personSeniorDeveloper);
        System.out.println(personSeniorDeveloper.getLikeCount());
    }

    static Person createPersonel(Person personel){
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite savo varda: ");
        String name = sc.nextLine();
        System.out.print("Iveskite savo pareigas (true: Developer / false: Manager): ");
        boolean qualification = sc.nextBoolean();
        personel.setQualification(qualification);
        personel.setName(name);
        return personel;
    }
}