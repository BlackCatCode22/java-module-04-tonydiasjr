

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        AnimalOrganizer organizer = new AnimalOrganizer(); // Create an instance of AnimalOrganizer
        String inputFilePath = "C:\\Users\\Tony Jr\\OneDrive\\cit-63\\arrivingAnimals.txt"; // Path to the input file
        String outputFilePath = "C:\\Users\\Tony Jr\\OneDrive\\cit-63\\newAnimals.txt"; // Path to the output file

        organizer.loadAnimals(inputFilePath); // Load animals from the file
        organizer.generateReport(outputFilePath); // Generate the report
        System.out.println("Report generated successfully!");
    }
}
public <ProcessEnvironment> void loadAnimals(String filePath) {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Split the line based on the first comma, which separates name from the rest
            String[] parts = line.split(", ", 2); // Split only once to get name and details
            if (parts.length == 2) {
                String name = parts[0]; // Extract name
                String details = parts[1]; // Get the remaining details

                // Use regex to extract age (assumed format: "4 year old")
                Matcher matcher = Pattern.compile("(\\d+) year old").matcher(details);
                int age = 0;
                if (matcher.find()) {
                    age = Integer.parseInt(matcher.group(1)); // Extract the number from the matched group
                }

                // Extract species from details (assumed to be at the end of the first comma-separated details)
                String species = details.split(" ")[3]; // Adjust based on the expected format

                // Create animal based on species
                Animal animal = createAnimal(name, age, species);
                if (animal != null) { // If the animal was created successfully

                    animals.add((CharSequence) animal); // Add to the list
                    ProcessEnvironment speciesCount;
                    speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1); // Update count
                }
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading the file: " + e.getMessage());
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

private Animal createAnimal(String name, int age, String species) {
}

public void main() {
}

public void main() {
}

public void main() {
}

public void main() {
}

public void main() {
}