import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Эхний тоо: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Хоёр дахь тоо: ");
            int b = Integer.parseInt(scanner.nextLine());

            int result = a / b;
            System.out.println("Үр дүн: " + result);

            int[] arr = { 1, 2, 3 };
            System.out.println(arr[a]); // a = 10 бол алдаа

        } catch (NumberFormatException e) {
            System.out.println("Алдаа: Зөвхөн тоо оруулна уу!");
        } catch (ArithmeticException e) {
            System.out.println("Алдаа: Тэгд хуваах боломжгүй!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Алдаа: Массивын хязгаараас хэтэрлээ!");
        } catch (Exception e) {
            // Бусад бүх алдаа
            System.out.println("Тодорхойгүй алдаа: " + e.getMessage());
        }

        scanner.close();
    }
}
