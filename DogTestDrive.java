class Dog {

  int size ;
  String breed;
  String name;

  void bark() {
    System.out.println("Ruff ruff!");
  }
}

class DogTestDrive {
  public static void  main(String[] args) {

    Dog d = new Dog();
    d.size = 40;
    d.name = "Scout";
    d.breed = "Labradoodle";
    d.bark();
  }
}
