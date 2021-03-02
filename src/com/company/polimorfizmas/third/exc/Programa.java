package com.company.polimorfizmas.third.exc;



public class Programa {
    public static void main(String[]args){
        NutolesDiskas nutolesDiskas = new NutolesDiskas();
        DuomenuBaze duomenuBaze = new DuomenuBaze();

        Info infoFirst = new Info(33, "git gud");
        Info infoThird = new Info(42, "getting good");
        Info infoSecond = new Info(2, "got better");
        Info infoFourth = new Info(61, "boop");

        saugoti(nutolesDiskas, infoFirst);
        saugoti(nutolesDiskas, infoSecond);
        saugoti(nutolesDiskas, infoThird);
        saugoti(nutolesDiskas, infoFourth);

        rastiPagalId(nutolesDiskas, 61);
        rastiPagalZodi(nutolesDiskas, "gud");

        saugoti(duomenuBaze, infoFirst);
        saugoti(duomenuBaze, infoSecond);
        saugoti(duomenuBaze, infoThird);
        saugoti(duomenuBaze, infoFourth);

        rastiPagalId(duomenuBaze, 2);
        rastiPagalZodi(duomenuBaze, "getting");

    }
    static void saugoti(Saugykla saugykla, Info info){
        saugykla.saugotInfo(info);
    }
    static void rastiPagalId(Saugykla saugykla, int id){
        System.out.println(saugykla.rastiInfo(id).toString());
    }
    static void rastiPagalZodi(Saugykla saugykla, String zodis){
        System.out.println(saugykla.rastiInfo(zodis).toString());
    }
}
