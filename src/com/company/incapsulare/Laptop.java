package com.company.incapsulare;

public class Laptop {
    private String model;
    private String culoare;
    private double pret;

    public Laptop(String model, String culoare, double pret){
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
    }

    public String print(){
        return  "Model:" + this.model + '\n' +
                "Culoare:" + this.culoare + '\n' +
                "Pret:" + this.pret ;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getModel(){
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPret() {
        return pret ;

    }
}
