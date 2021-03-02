package com.company.polimorfizmas.third.exc;

public class Info {
    private int id;
    private String tekstas;

    public Info(int id, String tekstas) {
        this.id = id;
        this.tekstas = tekstas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTekstas() {
        return tekstas;
    }

    public void setTekstas(String tekstas) {
        this.tekstas = tekstas;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", tekstas='" + tekstas + '\'' +
                '}';
    }
    boolean arYraTekste(String zodis){
        boolean arYra;
        if (tekstas.contains(zodis)){
            arYra=true;
        }else {
            arYra=false;
        }
        return arYra;
    }
}
