import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // addGrade method
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("❌ Оноо 0-100 хооронд байх ёстой!");
        }
    }

    // getAverage() method
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Integer g : grades) {
            sum += g;
        }

        return sum * 1.0 / grades.size();
    }

    // getGrade() method
    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90)
            return "A";
        if (avg >= 80)
            return "B";
        if (avg >= 70)
            return "C";
        if (avg >= 60)
            return "D";
        return "F";
    }

    // toString() method
    @Override
    public String toString() {
        return String.format(
                "ID: %s | Нэр: %s | Дундаж: %.2f | Үнэлгээ: %s | Оноо %s",
                id, name, getAverage(), getGrade(), grades.toString());
    }
}
