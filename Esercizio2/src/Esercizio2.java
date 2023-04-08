import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        Cinema cinema = new Cinema();

        System.out.println("Quante casse vuoi usare?");
        System.out.print("Casse: ");
        int numCasse = input.nextInt();

        Thread[] casse = new Thread[numCasse];

        for (int i = 0; i < casse.length; i++) {
            casse[i] = new Thread(() -> cinema.vendiBiglietti());
            casse[i].start();
        }

        for (Thread cassa : casse) {
            cassa.join();
        }

        System.out.println("\nPosti ancora disponibili: " + cinema.getPosti());
    }
}