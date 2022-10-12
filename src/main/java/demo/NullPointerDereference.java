package demo;

public class NullPointerDereference {

  public int getNumberOfLegs(String animal) {
    String trimmedAnimal = trim(animal);

    int legs;
    
    if ("dog".equals(trimmedAnimal)) {
      legs = 4;
    } else if ("kangaroo".equals(trimmedAnimal)) { // NullPointer issue raised
      legs = 2;
    } else if ("Centipede".equals(trimmedAnimal)) {
      legs = 100;
    } else if ("Fido".equals(trimmedAnimal)){
      legs = 3;
    } else {
      throw new IllegalArgumentException(String.format("Unknown Animal %s", trimmedAnimal));
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
