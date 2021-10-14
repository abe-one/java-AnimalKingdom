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
    System.out.println(fullAnimalList);

    System.out.println("\n*** Sort by year descending");
    fullAnimalList.sortByYear(false);
    System.out.println(fullAnimalList);

    System.out.println("\n*** Sort alphabetically");
    fullAnimalList.sortByName(true);
    System.out.println(fullAnimalList);

    System.out.println("\n*** Sort by move");
    AnimalList.sortByMove(fullAnimalList, true);
    System.out.println(fullAnimalList);

    System.out.println("\n*** Filter by lungs");
    AnimalList animalsWithLungs = AnimalList.filterList(fullAnimalList, (a) -> a.breathe() == "lungs");
    AnimalList.printList(animalsWithLungs);

    System.out.println("\n*** Filter by lungs and named in 1758");
    AnimalList animalsWithLungsNamedIn1758 = AnimalList.filterList(animalsWithLungs, (a) -> a.getYearNamed() == 1758);
    AnimalList.printList(animalsWithLungsNamedIn1758);

    System.out.println("\n*** Filter by lungs and egg laying");
    AnimalList animalsWithLungsThatLayEggs = AnimalList.filterList(animalsWithLungs, (a) -> a.reproduce() == "eggs");
    AnimalList.printList(animalsWithLungsThatLayEggs);

    System.out.println("\n*** Filter by 1758");
    AnimalList animals1758 = AnimalList.filterList(fullAnimalList, (a) -> a.getYearNamed() == 1758);
    AnimalList.printList(animals1758);

  }
}