public class Example02 {
    public static void main(String[] args) {
        try {
            System.out.println("Try блок эхэлж байна");
            int result = 10 / 2;
            System.out.println("Үр дүн: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch блок - Алдаа гарлаа!");
        } finally {
            System.out.println("Finally блок - Үргэлж ажиллана");
        }
        System.out.println("Програм дууслаа");
    }
}
