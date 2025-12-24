import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== NUMBER PARSER =====");

        System.out.print("Текст оруулна уу (гарах: exit): ");

        String input = scanner.nextLine();
        
        try {
            if ("exit".equalsIgnoreCase(input)) {
                throw new ExitException();
            }
            String text = input.trim();
            System.out.println("Бүхэл тоо: " + Integer.parseInt(text));
            System.out.println("Бутархай тоо: " + Double.parseDouble(text));
        } catch (NumberFormatException e) {
            try {
                System.out.println("Бүхэл тоо биш!");
                System.out.println("Бутархай тоо: " + Double.parseDouble(input));
            } catch (NumberFormatException ex) {
                System.out.println("Алдаа: \"" + input + "\" нь тоо биш!");
            }
        } catch (NullPointerException e) {
            System.out.println("Алдаа: Хоосон текст оруулсан!");
        } catch (ExitException e) {
            System.out.println("Баяртай!");
        } finally {
            scanner.close();
        }
    }
}
