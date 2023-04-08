public class Cinema {

    private int posti = 200;

    public int getPosti() {
        return posti;
    }

    public synchronized void vendiBiglietti() {
        if (posti > 0) {
            posti--;
            System.out.println("Biglietto venduto. Posti disponibili: " + posti);
        } else {
            System.out.println("Non ci sono più posti disponibili.");
        }
    }

}
