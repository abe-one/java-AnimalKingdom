package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
  private List<AbstractAnimal> animalList = new ArrayList<>();

  public AnimalList(AbstractAnimal... animals) {
    for (AbstractAnimal animal : animals) {
      animalList.add(animal);
    }
  }

  public List<AbstractAnimal> getList() {
    return animalList;
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
}
