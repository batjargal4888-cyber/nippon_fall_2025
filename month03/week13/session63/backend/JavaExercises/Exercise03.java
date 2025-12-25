import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== NUMBER PARSER =====");

        while (true) {
            System.out.print("Текст оруулна уу (гарах: exit): ");
            String input = scanner.nextLine();

            // exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Баяртай!");
                break;
            }

            // хоосон шалгах
            if (input == null || input.trim().isEmpty()) {
                System.out.println("Алдаа: Хоосон текст оруулсан байна!");
                System.out.println();
                continue;
            }

            try {
                // Эхлээд Double шалгана
                double doubleValue = Double.parseDouble(input);

                // Integer шалгах
                try {
                    int intValue = Integer.parseInt(input);
                    System.out.println("Бүхэл тоо: " + intValue);
                } catch (NumberFormatException e) {
                    System.out.println("Бүхэл тоо биш!");
                }

                // Double хэвлэх
                System.out.println("Бутархай тоо: " + doubleValue);

            } catch (NumberFormatException e) {
                System.out.println("Алдаа: \"" + input + "\" нь тоо биш!");
            }

            System.out.println();
        }

        scanner.close();
    }
}