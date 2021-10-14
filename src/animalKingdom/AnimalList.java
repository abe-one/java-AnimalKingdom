package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
  private List<AbstractAnimal> animalList = new ArrayList<>();

  public static void printList(AnimalList animalList) {
    animalList.getList().forEach((a) -> System.out.println(a));

  }

  public AnimalList(AbstractAnimal... animals) {
    for (AbstractAnimal animal : animals) {
      animalList.add(animal);
    }
  }

  public List<AbstractAnimal> getList() {
    return animalList;
  }

  public void add(AbstractAnimal animal) {
    animalList.add(animal);
  }

  public void sortByYear(boolean ascending) {
    if (ascending) {
      animalList.sort((a, b) -> Integer.compare(a.getYearNamed(), b.getYearNamed()));
    } else {
      animalList.sort((a, b) -> Integer.compare(b.getYearNamed(), a.getYearNamed()));
    }
  }

  public void sortByName(boolean ascending) {
    if (ascending) {
      animalList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
    } else {
      animalList.sort((a, b) -> b.getName().compareToIgnoreCase(a.getName()));
    }
  }

  public void sortByMove(boolean ascending) {
    if (ascending) {
      animalList.sort((a, b) -> a.move().compareToIgnoreCase(b.move()));
    } else {
      animalList.sort((a, b) -> b.move().compareToIgnoreCase(a.move()));
    }
  }

  public static void sortByMove(AnimalList animalList, boolean ascending) {
    if (ascending) {
      animalList.getList().sort((a, b) -> a.move().compareToIgnoreCase(b.move()));
    } else {
      animalList.getList().sort((a, b) -> b.move().compareToIgnoreCase(a.move()));
    }
  }

  public static AnimalList filterList(AnimalList animalList, CheckAnimal tester) {
    AnimalList filteredList = new AnimalList();

    for (AbstractAnimal a : animalList.getList()) {
      if (tester.test(a)) {
        filteredList.add(a);
      }
    }

    return filteredList;
  }

}
