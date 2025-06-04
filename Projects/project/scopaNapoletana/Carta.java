package project.scopaNapoletana;

import project.scopaNapoletana.enums.*;

public class Carta {
    private ValoreCarta valoreCarta;
    private Seme seme;


    public Carta(ValoreCarta valore , Seme seme) {
        this.valoreCarta = valore;
        this.seme = seme;
    }


    public ValoreCarta getValoreCarta() {
        return this.valoreCarta;
    }

    // public void setValoreCarta(ValoreCarta valoreCarta) {
    //     this.valoreCarta = valoreCarta;
    // }

    public Seme getSeme() {
        return this.seme;
    }

    // public void setSeme(Seme seme) {
    //     this.seme = seme;
    // }


    @Override
    public String toString() {
        return  "  " + getValoreCarta() + " " +   "'" + getSeme() + "'" ;
    }

}
