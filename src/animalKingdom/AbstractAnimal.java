package animalKingdom;

abstract class AbstractAnimal {
  protected static int maxId = 0;

  protected int id;
  protected String name;
  protected int yearNamed;
  protected boolean hunger;

  public AbstractAnimal(String name, int yearNamed) {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
    hunger = false;

  }

  public AbstractAnimal(String name, int yearNamed, boolean hunger) {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
    this.hunger = hunger;
  }

  abstract String move();

  abstract String breathe();

  abstract String reproduce();

  public void eat() {
    hunger = false;
  }

  @Override
  public String toString() {
    return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "}";
  }

}
