
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise02 {

    private ArrayList<Student> students;

    public Exercise02() {
        students = new ArrayList<>();
    }

    // 1. add student
    private void addStudent(String name, int score) {
        students.add(new Student(name, score));
        System.out.println("✅ Нэмэгдлээ!");
    }

    // 2. show all students
    private void showStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ Оюутан алга!");
            return;
        }
        int index = 1;
        for (Student s : students) {
            System.out.println(index + ". " + s.getName());
            index++;
        }
    }

    // 3. show average score
    private void showAverage() {
        if (students.isEmpty()) {
            System.out.println("⚠️ Тооцоолох өгөгдөл алга!");
        }
        int sum = 0;
        for (Student s : students)
            sum += s.getScore();
        int avg = (int) sum / students.size();
        System.out.print("📊 Дундаж оноо: " + avg);
    }

    // 4. show best student
    private void showBestStudent() {
        if (students.isEmpty()) {
            System.out.println("⚠️ Оюутан алга!");
            return;
        }
        Student best = students.get(0);

        for (Student s : students) {
            if (s.getScore() > best.getScore())
                best = s;
        }

        System.out.println("🏆 Шилдэг: " + best.getName());
    }

    // 5. sort students by name
    private void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
        if (students.isEmpty()) {
            System.out.println("⚠️ Оюутан алга!");
            return;
        }
        int index = 1;
        for (Student s : students) {
            System.out.println(index + ". " + s.getName());
            index++;
        }
        System.out.println("🔤 Нэрээр эрэмбэллээ!");
    }

    // print menu
    private void printMenu() {
        System.out.println("===== ОЮУТНЫ ОНОО =====");
        System.out.println("1. Оюутан нэмэх");
        System.out.println("2. Бүгдийг харах");
        System.out.println("3. Дундаж оноо");
        System.out.println("4. Шилдэг оюутан");
        System.out.println("5. Нэрээр эрэмбэлэх");
        System.out.println("6. Гарах");
    }

    // run the tracker
    public void run() {
        Scanner sc = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.println();
            System.out.print("Сонголт: ");
            String input = sc.nextLine();

            if (input.equals("6")) {
                System.out.println("👋 Баяртай!");
                break;
            }

            if (input.equals("1")) {
                System.out.print("Нэр: ");
                String name = sc.nextLine();

                System.out.print("Оноо: ");
                int score = Integer.parseInt(sc.nextLine());

                addStudent(name, score);
            }

            if (input.equals("2")) {
                System.out.println("📋 Жагсаалт:");
                showStudents();
            }

            if (input.equals("3")) {
                showAverage();
                System.out.println();
            }

            if (input.equals("4")) {
                showBestStudent();
            }

            if (input.equals("5")) {
                sortByName();
            }
        }

        sc.close();
    }
}
