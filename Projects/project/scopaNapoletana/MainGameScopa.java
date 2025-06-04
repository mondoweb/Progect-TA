package project.scopaNapoletana;

import java.util.List;

public class MainGameScopa {
    

    public static void main(String[] args) {
        
        List<String> nomi = List.of("Luca", "Marco");
        Partita partita = new Partita(nomi);
        partita.iniziaGioco();

    }
}
