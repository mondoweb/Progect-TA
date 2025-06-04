package project.scopaNapoletana;

// import java.util.*;

public class GiocoScopa {
    
//   public void giocaTurno(Giocatore giocatore, Carta cartaGiocata) {
//         List<List<Carta>> combinazioni = RegoleGioco.trovaCombinazioniSomma(carteATerra, cartaGiocata.getValoreCarta().getValore());

//         if (!combinazioni.isEmpty()) {
//             // Semplifichiamo: prende la prima combinazione valida
//             List<Carta> presa = combinazioni.get(0);
//             carteATerra.removeAll(presa);
//             giocatore.aggiungiPunto(); // 1 punto per presa
//             System.out.println(giocatore.getNome() + " prende con " + cartaGiocata + " le carte " + presa);
//         } else {
//             carteATerra.add(cartaGiocata);
//             System.out.println(giocatore.getNome() + " non prende e lascia la carta " + cartaGiocata + " sul tavolo.");
//         }

//         giocatore.getMano().remove(cartaGiocata);
//     }

//     public void iniziaGioco() {
//         for (int mano = 0; mano < 6; mano++) {
//             System.out.println("---- MANO " + (mano + 1) + " ----");
//             distribuisciCarte();

//             for (int turno = 0; turno < 3; turno++) {
//                 for (Giocatore g : giocatori) {
//                     // Semplificazione: gioca sempre la prima carta
//                     Carta scelta = g.getMano().get(0);
//                     giocaTurno(g, scelta);
//                 }
//             }
//         }

//         finePartita();
//     }

//     public void finePartita() {
//         Giocatore vincitore = null;
//         for (Giocatore g : giocatori) {
//             System.out.println(g.getNome() + " ha " + g.getPunteggio() + " punti.");
//             if (g.getPunteggio() >= 11 && (vincitore == null || g.getPunteggio() > vincitore.getPunteggio())) {
//                 vincitore = g;
//             }
//         }

//         if (vincitore != null) {
//             System.out.println("Vince " + vincitore.getNome() + "!");
//         } else {
//             System.out.println("Nessun vincitore. Partita pari.");
//         }
//     }

}
