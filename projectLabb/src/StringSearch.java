import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StringSearch{
    public static void main(String[] args) {

        String pattern = args[0];
        String filename = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;

            // Read each line and check if it contains the pattern
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    System.out.println(line);  // Print the line if pattern is found
                    found = true;
                }
            }

            // If no matching lines were found, print a message
            if (!found) {
                System.out.println("No matching lines found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}