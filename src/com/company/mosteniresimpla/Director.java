package com.company.mosteniresimpla;

public class Director {
    private String nume;
    private String functie;
    private int salariu;


    public Director(String nume, String functie, int salariu){
        this.nume = nume;
        this.functie = functie;
        this.salariu = salariu;
    }

    public String getNume(){

        return nume;
    }

    public void setNume(String nume){

        this.nume = nume;
    }

    public String getFunctie(){

        return functie;
    }

    public void setFunctie(String functie) {

        this.functie = functie;
    }

    public int getSalariu(){

        return salariu;
    }

    public void setSalariu(int salariu){
        this.salariu = salariu;
    }

    public String print(){
        return "Numele agentdevanzari: " + this.nume + '\n' +
                "Functia agentdevanzari: " + this.functie + '\n' +
                "Salariu agentdevanzari: " + this.salariu;
    }
}
