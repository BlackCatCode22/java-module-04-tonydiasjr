import java.util.ArrayList;

// Base class for Animal
class Animal {
    private String name; // Animal's name
    private int age;     // Animal's age
    private String species; // Type of animal

    // Constructor to initialize an animal
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters for the properties
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }
}
