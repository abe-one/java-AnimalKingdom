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

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYearNamed() {
    return yearNamed;
  }

  @Override
  public String toString() {
    return name + " " + reproduce() + " " + move() + " " + breathe() + " " + yearNamed;
  }

}
