import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {

    private static final String FILE_NAME = "students.csv";

    // 1. Оюутан нэмэх
    public void addStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            String line = student.getName() + "," +
                    student.getAge() + "," +
                    student.getScore();
            writer.write(line);
            writer.newLine();
            System.out.println("✅ Оюутан нэмэгдлээ!");

        } catch (IOException e) {
            System.out.println("❌ Алдаа: " + e.getMessage());
        }
    }

    // 2. Бүх оюутан харах
    public ArrayList<Student> loadStudents() {
        ArrayList<Student> students = new ArrayList<>();

        File file = new File(FILE_NAME);
        if (!file.exists()) return students;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    try {
                        String name = parts[0].trim();
                        int age = Integer.parseInt(parts[1].trim());
                        double score = Double.parseDouble(parts[2].trim());
                        students.add(new Student(name, age, score));
                    } catch (NumberFormatException e) {
                        System.out.println("Буруу формат: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Файл олдсонгүй, шинээр үүсгэнэ.");
        }

        return students;
    }

    // 3. 
}
