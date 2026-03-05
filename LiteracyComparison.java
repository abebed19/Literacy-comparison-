

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;


public class LiteracyComparison {
    
    public static void main(String[] args) {
       try {
            // We use Files.lines to create a stream of strings (one per line)
            Files.lines(Paths.get("literacy.csv"))
                .map(line -> line.split(","))
                .sorted((parts1, parts2) -> {
                    // CRITICAL: We must convert the string to a double 
                    // to ensure numerical sorting (e.g., 11.0 is less than 22.0)
                    double rate1 = Double.parseDouble(parts1[5]);
                    double rate2 = Double.parseDouble(parts2[5]);
                    return Double.compare(rate1, rate2);
                })
                .forEach(parts -> {
                    // Format: Niger (2015), female, 11.01572
                    // We strip " (%)" from the gender field
                    String gender = parts[2].replace(" (%)", "").trim();
                    System.out.println(parts[3].trim() + " (" + parts[4].trim() + "), " + gender + ", " + parts[5].trim());
                });
        } catch (Exception e) {
            // Handle potential file errors
        }

    }
}
