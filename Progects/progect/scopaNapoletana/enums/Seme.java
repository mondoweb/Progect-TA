package progect.scopaScoponeNapoletano.enums;

public enum Seme {
    //  DENARI,    // --> DENARI("D")
    //  COPPE,     // --> COPPE("C")
    //  SPADE,     // --> SPADE("S")
    //  BASTONI    // -->  Bastoni("B")

    DENARI(4), 
    COPPE(3), 
    SPADE(2), 
    BASTONI(1);

    private final int priorita;

    Seme(int priorita) {
        this.priorita = priorita;
    }

    public int getPriorita() {
        return priorita;
    }
}
