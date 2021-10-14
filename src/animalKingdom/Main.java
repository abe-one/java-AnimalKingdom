package animalKingdom;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from animalKingdom!");

    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    AnimalList fullAnimalList = new AnimalList(koala, sloth, armadillo, raccoon, bigfoot, peacock, toucan, parrot, swan,
        salmon, catfish, perch);

    System.out.println("\n*** Original full animal list");
    fullAnimalList.getList().forEach((a) -> System.out.println(a));

    System.out.println("\n*** Sort by year descending");
    fullAnimalList.sortByYear(false);
    fullAnimalList.getList().forEach((a) -> System.out.println(a));

    System.out.println("\n*** Sort alphbetically");
    fullAnimalList.sortByName(true);
    fullAnimalList.getList().forEach((a) -> System.out.println(a));

  }
}