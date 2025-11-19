import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нэмэх ажилтны нэр: ");
        String fn = scanner.nextLine();

        System.out.println("Нэмэх ажилтны овог: ");
        String ln = scanner.nextLine();

        System.out.println("Нэмэх ажилтны хэлтэс: ");
        String dept = scanner.nextLine();

        System.out.println("Нэмэх ажилтны цалин: ");
        int salary = scanner.nextInt();

        // Main нь JBDC-ийн талаар юу ч мэдэхгүй, зөвхөн service-г дуудна.
        service.addEmployee(fn, ln, dept, salary);

        System.out.println("--- Одоо цалин шинэчлье ---");
        System.out.println("Шинэчлэх ажилтны ID: ");
        int id1 = scanner.nextInt();

        System.out.println("Шинэ цалин: ");
        int newSalary = scanner.nextInt();
 
        service.updateEmployeeSalary(id1, newSalary);

        System.out.println("\n=== АЖИЛТАН УСТГАХ ===");
        System.out.print("ID: ");
        int id2 = scanner.nextInt();

        service.deleteEmployee(id2);


        System.out.println("\n=== ШИЛЖҮҮЛЭГ ===");
        System.out.print("Хэний ID-с: ");
        int from = scanner.nextInt();

        System.out.println("Хэнд: ");
        int to = scanner.nextInt();

        System.out.print("Дүн: ");
        int amount = scanner.nextInt();

        service.transferSalary(from, to, amount);

        scanner.close();

    }
}
