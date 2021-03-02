package com.company.polimorfizmas.third.exc;

import java.util.HashMap;
import java.util.Map;

public class DuomenuBaze implements Saugykla{
    private HashMap<Integer,Info> map = new HashMap<>();


    @Override
    public void saugotInfo(Info info) {
        map.put(info.getId(), info);
        System.out.println("Issaugota i duomenubaze");
    }

    @Override
    public Info rastiInfo(int id) {
        System.out.println("Rasta duomenu bazeje pagal id");
        return map.get(id);
    }

    @Override
    public Info rastiInfo(String zodis) {
        int id = 0;
        for (Map.Entry<Integer, Info> entry : map.entrySet()){
            if (entry.getValue().getTekstas().contains(zodis)){
                id = entry.getKey();
                break;
            }
        }
        System.out.println("Rasta duomenubazejepagal zodi");
        return map.get(id);
    }
}
