import java.util.Scanner;
class ScanString {
    public static void main(String[] args) {
        // 1. Scanner creation tsukuru
        Scanner scanner = new Scanner(System.in);
        // 2. Ask user name
        System.out.println("What is your name?");
        // 3. Read all the line
        String name = scanner.nextLine();
        // 4. Print output 
        System.out.println("Hello, " + name + "!");
        // 5. Scanner close
        scanner.close();
    }    
}
