public class Employee {
    private int id;
    private String firstName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
    }

    // Объектыг хэвлэхэд ашиглагдана
    public String toString() {
        return "Employee[ID=" + id + ", Нэр=" + firstName + ", Цалин=" + salary + "]";
    }
}