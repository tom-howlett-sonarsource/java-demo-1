package devoxx;

public class NullPointerDereference {
  
  public int getNumberOfPawsPlusOne(String animal, String fred) {
    String trimmedAnimal = trim(animal);
    String trimmedFred = trim(fred);
    
    int paws;
    if ("dog".equals(trimmedAnimal)) {
      paws = 4;
    } else if (trimmedAnimal.equals("tom")) { // NullPointer issue raised
      paws = 5;
    } else if (trimmedFred.equals("Martin")) { // NullPointer issue raised
      paws = 3;
    } else if ("Centipede".equals(trimmedAnimal)) {
      paws = 100;
    } else {
      throw new RuntimeException(String.format("Unknown Animal %s", trimmedAnimal));
    }
    // Quizz: What is the problem here?
    return paws++;

  }
  
  private String trim(String animal) {
    if (animal.isEmpty()) {
      return null;
    }
    return animal.trim();
  }
}
