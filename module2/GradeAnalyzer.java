import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
 
public class GradeAnalyzer {

        public static int totalProcessed = 0;
        public static int invalidSkipped = 0;
 
    public static void main(String[] args) {
        if (args.length < 1) {
        System.out.println("Usage: java GradeAnalyzer <scores_file> [report_file]");
        return;
        }

        String scoresFile = args[0];
        String reportFile = args.length > 1 ? args[1] : "report.txt";

        // Step 1: read scores from file
        ArrayList<Integer> scores = readScores(scoresFile);

        // Step 2: calculate statistics
        // Average score
        double avg = calculateAverage(scores);
        // Min and max scores
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }
       
     
        // Step 3: write and print report
        writeReport(scores, avg, high, low, reportFile);
    }
        
    // Returns a list of valid scores read from the file
    public static ArrayList<Integer> readScores(String filename) {
        // your code here
        ArrayList<Integer> scores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean hasLine = false;
            while ((line = br.readLine()) != null) {
                hasLine = true;
                line = line.trim();
                if (line.isEmpty()) {
                    System.out.println("Skipping invalid value: empty line");
                    totalProcessed++;
                    invalidSkipped++;
                    continue; 
                }
                totalProcessed++;
                try {  
                    int value = Integer.parseInt(line);
                    scores.add(value);
                } catch (NumberFormatException e) {
                    invalidSkipped++;
                    System.out.println("Skipping invalid value: " + line);
                }
            }
            if (!hasLine) {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }

        return scores; 
    }
 
    // Returns the average of a list of scores, or 0.0 if the list is empty
    public static double calculateAverage(ArrayList<Integer> scores) {
        // your code here
        if (scores.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.size();
    } 
 
    // Writes and prints the report
    public static void writeReport(ArrayList<Integer> scores,
                                   double avg, int high, int low,
                                   String outputFile) {
        // your code here
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("=== Grade Analysis Report ===\n");
            bw.write("Total scores processed: " + totalProcessed + "\n");
            bw.write("Invalid lines skipped: " + invalidSkipped + "\n");
            bw.write("Average Score: " + avg + "\n");
            bw.write("Highest Score: " + high + "\n");
            bw.write("Lowest Score: " + low + "\n");
            
            // Count grade bands
            bw.write("\nGrade Distribution:\n");
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
            for (int score : scores) {
                if (score >= 90) {
                    countA++;
                } else if (score >= 80) {
                    countB++;
                } else if (score >= 70) {
                    countC++;
                } else if (score >= 60) {
                    countD++;
                } else {
                    countF++;
                }
            }
            bw.write("A (90-100): " + countA + "\n");
            bw.write("B (80-89): " + countB + "\n");
            bw.write("C (70-79): " + countC + "\n");
            bw.write("D (60-69): " + countD + "\n");
            bw.write("F (below 60): " + countF + "\n");

            System.out.println("Report written to " + outputFile);

            // Print the same information to the console
            System.out.println("\n=== Grade Analysis Report ===");
            System.out.println("Total scores processed: " + totalProcessed);
            System.out.println("Invalid lines skipped: " + invalidSkipped);
            System.out.printf("\nAverage Score: %.2f\n", avg);  
            System.out.println("Highest Score: " + high);
            System.out.println("Lowest Score: " + low);
            System.out.println("\nGrade Distribution:");
            System.out.println("A (90-100): " + countA);
            System.out.println("B (80-89): " + countB);
            System.out.println("C (70-79): " + countC);
            System.out.println("D (60-69): " + countD);
            System.out.println("F (below 60): " + countF + "\n");
        } catch (IOException e) {
            System.out.println("Could not write report: " + e.getMessage());
        }
    }

    public static String getLetterGrade(int score) { 
    if (score >= 90) return "A"; 
    if (score >= 80) return "B";
    if (score >= 70) return "C"; 
    if (score >= 60) return "D"; 
    return "F";
    }
    
} 