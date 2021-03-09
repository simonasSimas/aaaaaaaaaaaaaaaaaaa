package com.company.polimorfizmas.papildoma;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws WrongOptionException {
        PersonImpl juniorDeveloper = new PersonImpl("aaaa", "Developer");
        PersonImpl seniorDeveloper = new PersonImpl("bbb", "Developer");
        PersonImpl midDeveloper = new PersonImpl("ccc", "Developer");
        PersonImpl projectManager = new PersonImpl("ddd", "Manager");
        Personel personel = new Personel();
        personel.addPersonel(juniorDeveloper);
        personel.addPersonel(seniorDeveloper);
        personel.addPersonel(midDeveloper);
        personel.addPersonel(projectManager);

        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(midDeveloper);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(midDeveloper);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(projectManager);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(projectManager);
        juniorDeveloper.likes(seniorDeveloper);
        juniorDeveloper.likes(projectManager);
        juniorDeveloper.likes(projectManager);
        midDeveloper.likes(juniorDeveloper);
        midDeveloper.likes(juniorDeveloper);
        midDeveloper.likes(juniorDeveloper);

        System.out.println("Junior developer: " + personel.getPerson("aaaa").getLikeCount());
        System.out.println("Senior developer: " + personel.getPerson("bbb").getLikeCount());
        System.out.println("Mid developer: " + personel.getPerson("ccc").getLikeCount());
        System.out.println("Project manager: " + personel.getPerson("ddd").getLikeCount());

        System.out.println("Developers got : " + juniorDeveloper.howManyLikesDoesThisBranchOfQualificationHave(juniorDeveloper,personel.getPersonel()) + " likes");
        System.out.println("Managers got: " + projectManager.howManyLikesDoesThisBranchOfQualificationHave(projectManager, personel.getPersonel()) + " likes");
        System.out.println("In total there were " + PersonImpl.howManyLikesInTotal(personel.getPersonel()) + " likes in total");
    }

    static PersonImpl createPersonel(PersonImpl personel) throws WrongOptionException {
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