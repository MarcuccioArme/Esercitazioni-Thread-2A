import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.print("\nInserisci il numero di jobs: ");
        int numJobs = input.nextInt();

        List<Thread> listaThreads = new ArrayList<>();
        for (int i = 0; i < numJobs; i++) {

            int sleepTime = new Random().nextInt(5000);
            System.out.print("\nInserisci il nome del Thread: ");
            String nomeThread = input.next();
            Thread thread = new Thread(new Job(nomeThread, sleepTime));
            listaThreads.add(thread);
            System.out.println("\nCreato " + nomeThread + " con durata " + sleepTime + " ms");

        }

        for (Thread thread : listaThreads) {
            thread.start();
        }

        for (Thread thread : listaThreads) {
            thread.join();
        }

        System.out.println("\nTutti i job sono stati eseguiti.");
    }
}