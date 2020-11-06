package com.company.mostenireierarhica;

import com.company.mostenireierarhica.Produs;

public class Pix extends Produs {
    private String culoare;

    public Pix(String nume, Double pret, String culoare){
        super(nume, pret);
        this.culoare = culoare;
    }
    @Override
    public String print(){
        return super.print()  + "Culoare:"
                + this.culoare;
    }
}