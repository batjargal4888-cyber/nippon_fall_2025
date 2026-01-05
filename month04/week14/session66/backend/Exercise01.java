import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    private ArrayList<String> productArrayList;

    public Exercise01() {
        productArrayList = new ArrayList<>();
    }

    // add product method
    private void addProduct(String product) {
        productArrayList.add(product);
        System.out.println("✅ " + "\"" + product + "\" нэмэгдлээ!");
    }

    // show all saved products
    public void showProducts() {
        int index = 1;
        for (String product : productArrayList) {
            System.out.println(index + ". " + product);
            index++;
        }
    }

    // search product in product list
    private void findProduct(String productName) {
        if (productArrayList.contains(productName)) {
            System.out.println("✅ " + "\"" + productName + "\" жагсаалтад байна!");
        } else {
            System.out.println(productName + " жагсаалтад байхгүй байна!");
        }
    }

    // remove elements from products
    private void deleteProduct(String productName) {
        productArrayList.remove(productName);
        System.out.println("✅ " + "\"" + productName + "\" устгагдлаа!");
    }

    private void printMenu() {
        System.out.println("===== ХУДАЛДААНЫ ЖАГСААЛТ =====");
        System.out.println("1. Нэмэх");
        System.out.println("2. Устгах");
        System.out.println("3. Жагсаалт харах");
        System.out.println("4. Хайх");
        System.out.println("5. Гарах");
    }

    // run the game
    public void run() {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (true) {
            System.out.println("");
            System.out.print("Сонголт: ");
            String input = scanner.nextLine();

            if (input.equals("5")) {
                System.out.println("Goodbye!");
                break;
            }

            if (input.equals("1")) {
                System.out.print("Бараа нэр: ");
                String productName = scanner.nextLine();
                addProduct(productName);
            }

            if (input.equals("2")) {
                System.out.print("Бараа нэр: ");
                String productName = scanner.nextLine();
                deleteProduct(productName);
            }

            if (input.equals("3")) {
                System.out.println("📋 Жагсаалт:");
                showProducts();
            }

            if (input.equals("4")) {
                System.out.print("Хайх бараа: ");
                String productName = scanner.nextLine();
                findProduct(productName);
            }
        }
        scanner.close();
    }
}
