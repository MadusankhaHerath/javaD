import java.io.*;

public class trycatchex2 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Try to open and read from a file
            File file = new File("example.txt"); // Make sure this file exists or it will throw
            FileReader fr = new FileReader(file);
            reader = new BufferedReader(fr);

            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            // Cleanup
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        System.out.println("Program ended.");
    }
}
