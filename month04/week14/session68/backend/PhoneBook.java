import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Search Name: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println(" " + searchName + ": " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Name does not exist");
                    }
                    break;
                case "2":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.put(name, phone);
                    System.out.println("Added!");
                    break;

                case "3":
                    System.out.print("Name: ");
                    String deleteName = scanner.nextLine();
                    if (phoneBook.containsKey(deleteName)) {
                        phoneBook.remove(deleteName);
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Name does not exist");
                    }
                    break;

                case "4":
                    System.out.println("Phonebook: ");
                    for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + " :" + entry.getValue());
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== 📞 УТАСНЫ ДЭВТЭР =====");
        System.out.println("1. Хайх");
        System.out.println("2. Нэмэх");
        System.out.println("3. Устгах");
        System.out.println("4. Бүгдийг харах");
        System.out.println("5. Гарах");
        System.out.print("Сонголт: ");
    }
}
