public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        System.out.println("\n===== ОЮУТНЫ БҮРТГЭЛ =====");
        System.out.println("1. Оюутан нэмэх");
        System.out.println("2. Бүх оюутан харах");
        System.out.println("3. Дундаж оноо");
        System.out.println("4. Шилдэг оюутан");
        System.out.println("5. Нэрээр хайх");
        System.out.println("6. Оноо шинэчлэх");
        System.out.println("7. Гарах");
        while (true) {
            System.out.print("\nСонголт: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.showAllStudents();
                case 3 -> manager.averageScore();
                case 4 -> manager.bestStudent();
                case 5 -> manager.searchByName();
                case 6 -> manager.updateScore();
                case 7 -> {
                    System.out.println("👋 Баяртай!\n");
                    return;
                }
            }
        }
    }
}
