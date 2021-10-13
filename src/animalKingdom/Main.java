package animalKingdom;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from animalKingdom!");

    Bird parrot = new Bird("parrot", 1493);

    System.out.println(parrot.breathe() + parrot);
  }
}