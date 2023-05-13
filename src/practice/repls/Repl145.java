package practice.repls;

public class Repl145 {
    private String dogName;
    private String dogWeight;
    static String dogBreed = "Mutt";

    public Repl145(String dogName, String dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    public void printDog() {
        System.out.print(dogName + " " + dogBreed + " " + dogWeight);
        System.out.println();
    }
}
