import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== ХУВААХ ТООЦООЛУУР =====");
        try {
            System.out.print("Эхний тоо оруулна уу: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Хоёр дахь тоо оруулна уу: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            int result = num1 / num2;
            System.out.println("Үр дүн: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Алдаа: Тэгд хуваах боломжгүй!");
        } catch (NumberFormatException e) {
            System.out.println("Алдаа: Зөвхөн тоо оруулна уу!");
        } finally {
            scanner.close();
            System.out.println("Тооцоолуур хаагдлаа.");
        }
    }
}
