import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {

    private final String FILE_NAME = "students.csv";

    // 📌 1. Оюутан файлд нэмэх
    public void addStudent(StudentList student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            writer.write(student.toCSV());
            writer.newLine();

            System.out.println("✅ Оюутан нэмэгдлээ!");

        } catch (IOException e) {
            System.out.println("Файлд бичихэд алдаа гарлаа");
        }
    }

    // 📌 2. Файлаас бүх оюутан унших
    public ArrayList<StudentList> loadStudents() {
        ArrayList<StudentList> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");

                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    double score = Double.parseDouble(parts[2]);

                    students.add(new StudentList(name, age, score));
                }
            }
            
        } catch (IOException e) {
            // файл байхгүй үед зүгээр л хоосон array буцаана
        }

        return students;
    }

    // 📌 3. Бүх оюутан хэвлэх
    public void showAllStudents() {
        ArrayList<StudentList> students = loadStudents();

        if (students.isEmpty()) {
            System.out.println("📭 Оюутан байхгүй");
            return;
        }

        int i = 1;
        for (StudentList s : students) {
            System.out.println(i + ". " + s);
            i++
        }
    }

    // 📌 4. Дундаж оноо
    public void averageScore() {
        ArrayList<StudentList> students = loadStudents();

        if (students.isEmpty()) {
            System.out.println("Оюутан байхгүй");
            return;
        }

        double sum = 0;

        for (StudentList s : students) {
            sum += s.getScore()
        }

        System.out.println("📊 Дундаж оноо: " + (sum / studens.size()));
    }

    // 📌 5. Шилдэг оюутан
    public void bestStudent() {
        ArrayList<StudentList> students = loadStudents();

        if (students.isEmpty()) return;

        StudentList best = students.get(0);

        for (StudentList s : students) {
            if (s.getScore() > best.getScore()) {
                best.s;
            }
        }
    }
}
