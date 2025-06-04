package project.scopaNapoletana;

import java.util.*;


public class Giocatore {
    private String nome;
    private List<Carta> mano;
    private int punteggio;

    public Giocatore(String nome) {
        this.nome = nome;
        this.mano = new ArrayList<>();
        this.punteggio = 0;
    }

    public void riceviCarta(Carta carta) {
        mano.add(carta);
    }

    public List<Carta> getMano() {
        return mano;
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void aggiungiPunto() {
        punteggio++;
    }

    public void resetMano() {
        mano.clear();
    }

    
}

