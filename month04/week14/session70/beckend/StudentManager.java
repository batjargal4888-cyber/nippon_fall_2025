import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private final String FILE_NAME = "students.csv";
    private Scanner sc = new Scanner(System.in);

    // CSV-ээс унших:
    public ArrayList<Student> loadStudentsFromFile() {
        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1].trim());
                    double score = Double.parseDouble(parts[2].trim());
                    students.add(new Student(name, age, score));
                }
            }
        } catch (IOException e) {
            System.out.println("Файл олдсонгүй, шинээр үүсгэнэ.");
        }
        return students;
    }

    // CSV руу бичих:
    public void saveStudentToFile(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv", true))) {
            // Format: name,age,score
            String line = student.getName() + "," +
                    student.getAge() + "," +
                    student.getScore();
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Алдаа: " + e.getMessage());
        }
    }

    // 1. Оюутан нэмэх
    public void addStudent() {
        System.out.print("Нэр: ");
        String name = sc.nextLine();
        System.out.print("Нас: ");
        int age = sc.nextInt();
        System.out.print("Оноо: ");
        double score = sc.nextDouble();
        sc.nextLine();
        Student s = new Student(name, age, score);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv", true))) {
            writer.write(s.toCSV());
            writer.newLine();
            System.out.println("✅ Оюутан нэмэгдлээ!");
        } catch (IOException e) {
            System.out.println("Алдаа: " + e.getMessage());
        }
    }

    // 2. Бүх оюутан харах
    public void showAllStudents() {
        ArrayList<Student> students = loadStudentsFromFile();
        if (students.isEmpty()) {
            System.out.println("⚠️ Мэдээлэл алга");
            return;
        }
        System.out.println("📋 Бүх оюутнууд:");
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│ #  │ Нэр            │ Нас │ Оноо    │");
        System.out.println("├─────────────────────────────────────┤");
        int i = 1;
        for (Student s : students) {
            System.out.printf(
                    "│ %-2d │ %-14s │ %-3d │ %-7.1f │%n",
                    i++, s.getName(), s.getAge(), s.getScore());
        }
        System.out.println("└─────────────────────────────────────┘");
    }

    // 3. Дундаж оноо
    public void averageScore() {
        ArrayList<Student> students = loadStudentsFromFile();
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        System.out.printf("📊 Дундаж оноо: %.2f%n",
                sum / students.size());
    }

    // 4. Шилдэг оюутан
    public void bestStudent() {
        ArrayList<Student> students = loadStudentsFromFile();
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getScore() > best.getScore()) {
                best = s;
            }
        }
        System.out.println("🏆 Шилдэг оюутан: " + best.getName() + " (" + best.getScore() + " оноо)");
    }

    // 5. Нэрээр хайх
    public void searchByName() {
        ArrayList<Student> students = loadStudentsFromFile();
        System.out.print("Хайх нэр: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("🔍 Олдлоо: " + s);
                return;
            }
        }
        System.out.println("❌ Олдсонгүй");
    }

    // Зөвхөн оноо өөрчлөхөд хэрэгтэй method
    public void saveAllStudents(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv"))) { // append = false

            for (Student s : students) {
                writer.write(s.getName() + "," +
                        s.getAge() + "," +
                        s.getScore());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Файлд бичихэд алдаа гарлаа.");
        }
    }

    // 6. Оноо шинэчлэх
    public void updateScore() {
        ArrayList<Student> students = loadStudentsFromFile();
        if (students.isEmpty()) {
            System.out.println("⚠️ Оюутан алга");
            return;
        }
        System.out.print("Оюутны нэр: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.print("Шинэ оноо: ");
                double newScore = sc.nextDouble();
                sc.nextLine();
                s.setScore(newScore);
                saveAllStudents(students);
                System.out.println("✅ Оноо шинэчлэгдлээ!");
                return;
            }
        }
        System.out.println("❌ Оюутан олдсонгүй");
    }
}
