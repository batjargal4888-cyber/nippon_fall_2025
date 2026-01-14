import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
    private static HashMap<String, Student> students = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        showMenu();

        while (running) {

            System.out.print("\nСонголт: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    searchById();
                    break;
                case "3":
                    addGrade();
                    break;
                case "4":
                    showAllStudents();
                    break;
                case "5":
                    showStatistics();
                    break;
                case "6":
                    running = false;
                    System.out.println("👋 Баяртай!");
                    break;
                default:
                    System.out.println("❌ Буруу сонголт!");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║     📚 ОЮУТНЫ МЕНЕЖЕР СИСТЕМ       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║  1. ➕ Оюутан нэмэх                ║");
        System.out.println("║  2. 🔍 ID-аар хайх                 ║");
        System.out.println("║  3. 📝 Оноо нэмэх                  ║");
        System.out.println("║  4. 📋 Бүх оюутан                  ║");
        System.out.println("║  5. 📊 Статистик                   ║");
        System.out.println("║  6. ❌ Гарах                       ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    // 1. Оюутан нэмэх
    private static void addStudent() {
        System.out.print("ID: ");
        String id = scanner.nextLine();

        if (students.containsKey(id)) {
            System.out.println("❌ Энэ ID аль хэдийн бүртгэгдсэн!");
            return;
        }

        System.out.print("Нэр: ");
        String name = scanner.nextLine();

        students.put(id, new Student(name, id));
        System.out.println("✅ Оюутан амжилттай нэмэгдлээ!");
    }

    // 2. ID-аар хайх
    private static void searchById() {
        System.out.print("Хайх ID: ");
        String id = scanner.nextLine();

        Student s = students.get(id);
        if (s == null) {
            System.out.println("❌ Оюутан олдсонгүй!");
        } else {
            System.out.println(s);
        }
    }

    // 3. Оноо нэмэх
    private static void addGrade() {
        System.out.print("Оюутны ID: ");
        String id = scanner.nextLine();

        Student s = students.get(id);
        if (s == null) {
            System.out.println("❌ Оюутан олдсонгүй!");
            return;
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "-р оноо: ");
            try {
                int grade = Integer.parseInt(scanner.nextLine());
                s.addGrade(grade);
            } catch (NumberFormatException e) {
                System.out.println("❌ Буруу тоо, алгаслаа");
            }
        }

        System.out.println("✅ 3 оноо нэмэгдлээ!");
    }

    // 4. Бүх оюутан
    private static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ Бүртгэлтэй оюутан алга!");
            return;
        }

        // 1. ID-уудыг list болгох
        ArrayList<String> ids = new ArrayList<>(students.keySet());

        // 2. ID-гаар эрэмбэлэх
        Collections.sort(ids);

        // 3. Эрэмбэлсэн дарааллаар хэвлэх
        for (String id : ids) {
            System.out.println(students.get(id));
        }
    }

    // 5. Статистик
    private static void showStatistics() {
        if (students.isEmpty()) {
            System.out.println("⚠️ Мэдээлэл алга!");
            return;
        }

        double totalAvg = 0;
        Student best = null;
        Student worst = null;

        HashMap<String, Integer> gradeCount = new HashMap<>();
        gradeCount.put("A", 0);
        gradeCount.put("B", 0);
        gradeCount.put("C", 0);
        gradeCount.put("D", 0);
        gradeCount.put("F", 0);

        for (Student s : students.values()) {
            double avg = s.getAverage();
            totalAvg += avg;

            if (best == null || avg > best.getAverage())
                best = s;
            if (worst == null || avg < worst.getAverage())
                worst = s;

            gradeCount.put(
                    s.getGrade(),
                    gradeCount.get(s.getGrade()) + 1);
        }

        int count = students.size();
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║                📊 АНГИЙН СТАТИСТИК                 ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                                                    ║");

        System.out.printf("║  📈 Ангийн дундаж: %-30.2f  ║%n", totalAvg / count);
        System.out.printf("║  🥇 Шилдэг:        %-15s (%.2f)         ║%n", best.getName(), best.getAverage());
        System.out.printf("║  🔻 Хамгийн бага:  %-15s (%.2f)         ║%n", worst.getName(), worst.getAverage());

        System.out.println("║                                                    ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                 ҮНЭЛГЭЭНИЙ ТАРХАЛТ                 ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                                                    ║");

        for (String g : gradeCount.keySet()) {
            int c = gradeCount.get(g);
            double percent = (double) c / count * 100;

            int barLength = (int) (percent / 10);

            String bar = "";
            for (int i = 0; i < barLength; i++) {
                bar += "███";
            }

            String emoji = "";
            switch (g) {
                case "A":
                    emoji = "🌟";
                    break;
                case "B":
                    emoji = "✨";
                    break;
                case "C":
                    emoji = "👍";
                    break;
                case "D":
                    emoji = "⚠️ ";
                    break;
                case "F":
                    emoji = "❌";
                    break;
            }

            System.out.printf(
                    "║  %s %s: %2d (%5.1f%%) %-30s  ║%n",
                    emoji, g, c, percent, bar);
        }

        System.out.println("║                                                    ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                                                    ║");

        int passed = 0;
        int failed = 0;

        for (Student s : students.values()) {
            if (s.getAverage() >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        int total = students.size();

        double passedPercent = (double) passed / total * 100;
        double failedPercent = (double) failed / total * 100;

        System.out.printf("║  ✅ Тэнцсэн:   %3d (%3.2f%%)                       ║%n",
                passed,
                passedPercent);

        System.out.printf("║  ❌ Тэнцээгүй: %3d (%3.2f%%)                         ║%n",
                failed,
                failedPercent);

        System.out.println("║                                                    ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }
}
