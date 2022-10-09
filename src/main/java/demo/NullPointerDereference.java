package demo;

public class NullPointerDereference {

  public int getNumberOfLegsPlusOne(String animal) {
    String trimmedAnimal = trim(animal);

    int legs;
    if ("dog".equals(trimmedAnimal)) {
      legs = 4;
    } else if ("kangaroo".equals(trimmedAnimal)) { 
      legs = 2;
    } else if ("Centipede".equals(trimmedAnimal)) {
      legs = 100;
    } else if("pirate".equals(trimmedAnimal)) {
      legs = 1;
    } else {
      throw new RuntimeException(String.format("Unknown Animal %s", trimmedAnimal));
    }
    return ++legs;

  }

  private String trim(String animal) {
    if (animal.isEmpty()) {
      return null;
    }
    return animal.trim();
  }
}
