public class Job implements Runnable {
    private final String nome;
    private final int sleepTime;

    public Job(String nome, int sleepTime) {
        this.nome = nome;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("\n" + nome + " inizia la sleep di " + sleepTime + " ms");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + nome + " ha concluso la sleep di " + sleepTime + " ms");
    }
}