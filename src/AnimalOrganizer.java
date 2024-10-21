import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Class to organize and manage animals
class AnimalOrganizer {
    List<Animal> animals = new ArrayList<>(); // Store animal instances
    HashMap<String, Integer> speciesCount = new HashMap<>(); // Count of each species

    // Load animals from a text file
    public void loadAnimals(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line into name, age, and species
                String[] parts = line.split(", "); // Assumes well-formatted input
                if (parts.length >= 3) { // Ensure there are at least 3 parts
                    String name = parts[0]; // Extract name
                    int age = Integer.parseInt(parts[1]); // Extract age
                    String species = parts[2]; // Extract species

                    // Create animal based on species
                    Animal animal = createAnimal(name, age, species);
                    if (animal != null) { // If the animal was created successfully
                        animals.add(animal); // Add to the list
                        speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1); // Update count
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Helper method to create the appropriate animal object
    private Animal createAnimal(String name, int age, String species) {
        switch (species.toLowerCase()) {
            case "hyena":
                return new Hyena(name, age);
            case "lion":
                return new Lion(name, age);
            case "tiger":
                return new Tiger(name, age);
            case "bear":
                return new Bear(name, age);
            default:
                return null; // Return null for unrecognized species
        }
    }

    // Generate a report of the animals and their species counts
    public void generateReport(String outputFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("Animal Report\n");
            writer.write("================================\n");

            // List all animals
            for (Animal animal : animals) {
                writer.write("Name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies() + "\n");
            }

            // List counts of each species
            writer.write("\nSpecies Count:\n");
            for (String species : speciesCount.keySet()) {
                writer.write(species + ": " + speciesCount.get(species) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing the report: " + e.getMessage());
        }
    }
}