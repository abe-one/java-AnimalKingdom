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

  public static List<AbstractAnimal> createList(AbstractAnimal... animals) {

    List<AbstractAnimal> animalList = new ArrayList<>();

    for (AbstractAnimal animal : animals) {
      animalList.add(animal);
    }
    return animalList;
  }

  public List<AbstractAnimal> getAnimals() {
    return animalList;
  }

}
