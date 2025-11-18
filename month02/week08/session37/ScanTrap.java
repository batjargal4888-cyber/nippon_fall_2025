import java.util.Scanner;

class ScanTrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Read a number
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // 2. New line trap clean up
        scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! You are " + age + " years old!");
        scanner.close();
    }
}
