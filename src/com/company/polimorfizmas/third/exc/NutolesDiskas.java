package com.company.polimorfizmas.third.exc;

import java.util.ArrayList;
import java.util.List;

public class NutolesDiskas implements Saugykla{
    private List<Info> infoArrayList = new ArrayList<>();

    @Override
    public void saugotInfo(Info info) {System.out.println("Issaugota i nutolusi diska");

        infoArrayList.add(info);
    }

    @Override
    public Info rastiInfo(int id) {
        int i = 0;
        for (Info info : infoArrayList){
            if (info.getId()==id){
                break;
            }
            i++;
        }
        System.out.println("Rasta nutolusiame diske pagal id");
        return infoArrayList.get(i);
    }

    @Override
    public Info rastiInfo(String zodis) {
        int i = 0;
        for (Info info : infoArrayList){
            if (info.getTekstas().contains(zodis)){
                break;
            }
            i++;
        }
        System.out.println("Rasta nutolusiame diske pagal zodi");
        return infoArrayList.get(i);
    }
}
