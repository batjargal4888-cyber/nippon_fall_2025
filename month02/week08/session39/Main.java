import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        System.out.println("--- 1. Бүх ажилтныг жагсаах ---");
        List<Employee> allEmployees = service.getAllEmployees();

        // `Employee` класс доторх toString() метод ажиллана
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }

        System.out.println("\n--- 2. Тодорхой нэг ажилтан хайх ---");
        int idToFind = 1; // Энд өөрийн ДБ-д байгаа ID-г бичээрэй
        Employee foundEmployee = service.getEmployeeById(idToFind);

        if (foundEmployee != null) {
            System.out.println("Олдсон: " + foundEmployee);
        } else {
            System.out.println(idToFind + " ID-тай ажилтан олдсонгүй.");
        }
    }
}
