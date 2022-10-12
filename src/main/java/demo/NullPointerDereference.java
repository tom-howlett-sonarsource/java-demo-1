package demo;

public class NullPointerDereference {

  public int getNumberOfLegs(String animal) {
    String trimmedAnimal = trim(animal);

    int legs;
    int arms;
    
    if ("dog".equals(trimmedAnimal)) {
      legs = 4;
    } else if (trimmedAnimal.equals("kangaroo")) { // NullPointer issue raised
      legs = 2;
    } else if ("Centipede".equals(trimmedAnimal)) {
      legs = 100;
    } else {
      throw new RuntimeException(String.format("Unknown Animal %s", trimmedAnimal));
    }

    return legs;

  }

  private String trim(String animal) {
    if (animal.isEmpty()) {
      return null;
    }
    return animal.trim();
  }
}
