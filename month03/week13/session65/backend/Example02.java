import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example02 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write("Hello world");
            writer.newLine();
            writer.write("Bayaraa");
            writer.newLine();
            writer.write("Bye Bye");
            writer.newLine();
            System.out.println("File Write Successful");
        } catch (IOException e) {
            System.out.println("Error during write into File " + e.getMessage());
        }
    }
}