import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив: [10, 20, 30, 40, 50]");
        System.out.print("Index оруулна уу (0-" + (numbers.length - 1) + "): ");
        String input = scanner.nextLine();
        try {
            int index = Integer.parseInt(input);
            System.out.println("Элемент [" + index + "] = " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Алдаа: Index 0-" + (numbers.length - 1) + " хооронд байх ёстой!");
        } catch (NumberFormatException e) {
            System.out.println("Алдаа: Зөвхөн тоо оруулна уу!");
        } finally {
            scanner.close();
        }
    }
}
