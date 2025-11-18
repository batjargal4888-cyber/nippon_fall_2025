import java.util.Scanner;
import java.time.Year;
class ScanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("When are you born?");
        // 1. Read integer number
        int birthYear = scanner.nextInt();
        // 2. Calculate age
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("You are about : " + age + " years old!");
        scanner.close();
    }
}
