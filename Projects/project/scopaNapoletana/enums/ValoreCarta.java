
package project.scopaNapoletana.enums;

public enum ValoreCarta {
   ASSO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5),
   SEI(6), SETTE(7), DONNA(8), FANTE(9), RE(10);

    private final int valores;

    ValoreCarta(int valore) {
        this.valores = valore;
    }

    public int getValore() {
        return valores;
    }

    @Override
    public String toString() {
        return name(); 
    }

}
