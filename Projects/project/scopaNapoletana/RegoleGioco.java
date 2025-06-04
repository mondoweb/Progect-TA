package project.scopaNapoletana;

import java.util.*;

public class RegoleGioco {
    
    public static List<List<Carta>> trovaCombinazioniSomma(List<Carta> carteATerra, int valoreObiettivo) {
        List<List<Carta>> combinazioni = new ArrayList<>();
        int n = carteATerra.size();
        
        for (int i = 1; i < (1 << n); i++) {
            List<Carta> combinazione = new ArrayList<>();
            int somma = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    combinazione.add(carteATerra.get(j));
                    somma += carteATerra.get(j).getValoreCarta().getValore();
                }
            }
            if (somma == valoreObiettivo) {
                combinazioni.add(combinazione);
            }
        }

        return combinazioni;
    }
}
