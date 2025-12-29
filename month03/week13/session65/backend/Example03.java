import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== ХЭРЭГЛЭГЧ БҮРТГЭХ =====");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        String age = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt", true))) {
            writer.write(name + ", " + age + ", " + email);
            writer.newLine();
            System.out.println("Username written successfully");
        } catch (Exception e) {
            System.out.println("Error during File write");
        }
        scanner.close();
    }
}
