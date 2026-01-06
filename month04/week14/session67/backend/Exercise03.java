import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03 {
    private ArrayList<Product> products;

    public Exercise03() {
        products = new ArrayList<>();
    }

    // 1. add
    private void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
        System.out.println("✅ Бараа нэмэгдлээ!");
    }

    // 2. search
    private void searchProduct(String name) {
        boolean found = false;

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("🔍 Олдлоо: " + p.getName()
                        + " | Үнэ: " + p.getPrice()
                        + " | Тоо: " + p.getQuantity());
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ Бараа олдсонгүй!");
        }
    }

    // 3. update quantity
    private void updateQuantity(String name, int quantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setQuantity(quantity);
                System.out.println("🔄 Тоо шинэчлэгдлээ!");
                return;
            }
        }
        System.out.println("❌ Бараа олдсонгүй!");
    }

    // 4. show all
    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("⚠️ Бараа алга!");
            return;
        }

        int index = 1;
        for (Product p : products) {
            System.out.println(index + ". " + p.getName()
                    + " | Үнэ: " + p.getPrice()
                    + " | Тоо: " + p.getQuantity());
            index++;
        }
    }

    // 5. total price
    private void showTotalPrice() {
        if (products.isEmpty()) {
            System.out.println("⚠️ Тооцоолох өгөгдөл алга!");
            return;
        }

        int total = 0;
        for (Product p : products)
            total += p.totalPrice();

        System.out.println("💰 Нийт үнэ: " + total + "₮");
    }

    // 6. show out of stock
    private void showOutOfStock() {
        boolean found = false;

        for (Product p : products) {
            if (p.getQuantity() == 0) {
                System.out.println("⚠️ Дууссан: " + p.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("✅ Дууссан бараа байхгүй");
        }
    }

    // print menu
    private void printMenu() {
        System.out.println("===== БҮТЭЭГДЭХҮҮНИЙ АГУУЛАХ =====");
        System.out.println("1. Нэмэх");
        System.out.println("2. Хайх");
        System.out.println("3. Тоо шинэчлэх");
        System.out.println("4. Бүгдийг харах");
        System.out.println("5. Нийт үнэ");
        System.out.println("6. Дууссан бараа");
        System.out.println("7. Гарах");
    }

    // run program
    public void run() {
        Scanner sc = new Scanner(System.in);
        printMenu();

        while (true) {
            System.out.println();
            System.out.println("Сонголт: ");
            String input = sc.nextLine();

            if (input.equals("7")) {
                System.out.println("👋 Баяртай!");
                break;
            }

            if (input.equals("1")) {
                System.out.println("Нэр: ");
                String name = sc.nextLine();

                System.out.println("Үнэ: ");
                double price = Double.parseDouble(sc.nextLine());

                System.out.println("Нэр: ");
                int quantity = Integer.parseInt(sc.nextLine());

                addProduct(name, price, quantity);
            }

            if (input.equals("2")) {
                System.out.print("Хайх нэр: ");
                String name = sc.nextLine();
                searchProduct(name);
            }

            if (input.equals("3")) {
                System.out.print("Нэр: ");
                String name = sc.nextLine();

                System.out.print("Шинэ тоо: ");
                int quantity = Integer.parseInt(sc.nextLine());

                updateQuantity(name, quantity);
            }

            if (input.equals("4")) {
                showProducts();
            }

            if (input.equals("5")) {
                showTotalPrice();
            }

            if (input.equals("6")) {
                showOutOfStock();
            }
        }
        sc.close();
    }
}