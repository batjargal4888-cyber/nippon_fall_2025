import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotesManager manager = new NotesManager();

        boolean running = true;

        System.out.println("\n===== ТЭМДЭГЛЭЛ МЕНЕЖЕР =====");
        System.out.println("1. Тэмдэглэл нэмэх");
        System.out.println("2. Бүгдийг харах");
        System.out.println("3. Хайх");
        System.out.println("4. Устгах");
        System.out.println("5. Тоо харах");
        System.out.println("6. Гарах");

        while (running) {
            System.out.print("\nСонголт: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Тэмдэглэл: ");
                String text = scanner.nextLine();
                manager.addNote(text);

            } else if (choice.equals("2")) {
                manager.showAll();

            } else if (choice.equals("3")) {
                System.out.print("Хайх үг: ");
                String keyword = scanner.nextLine();
                manager.search(keyword);

            } else if (choice.equals("4")) {
                manager.showAll();
                System.out.print("Устгах дугаар: ");
                int index = Integer.parseInt(scanner.nextLine());
                manager.delete(index);

            } else if (choice.equals("5")) {
                manager.count();

            } else if (choice.equals("6")) {
                System.out.println("👋 Баяртай!");
                running = false;

            } else {
                System.out.println("❌ Буруу сонголт");
            }
        }

        scanner.close();
    }
}
