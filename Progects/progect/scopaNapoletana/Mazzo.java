package progect.scopaNapoletana;
import java.util.*;

import progect.scopaNapoletana.enums.*;



public class Mazzo {

      private List<Carta> carte;

    public Mazzo() {
        carte = new ArrayList<Carta>();

        for (Seme seme : Seme.values()) {
            for (ValoreCarta valore : ValoreCarta.values()) {
                carte.add(new Carta(valore, seme));
            }
        }
        Collections.shuffle(carte);
        //  --> shuffling, è un processo di riorganizzazione casuale degli elementi di un array

    }

    public Carta pescaCarta() {
        if (carte.isEmpty()) {
            throw new IllegalStateException("il mazzo è vuoto");
        }

        return carte.remove(0);
        // scarta il primo elemento e  lo restituisce
    }
    
}
