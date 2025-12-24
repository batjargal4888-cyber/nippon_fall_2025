public class Example01 {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[10]); // Алдаа!
        } catch (ArrayIndexOutOfBoundsException e) {
            // getMessage() - Алдааны мэдээлэл
            System.out.println("Мэдээлэл: " + e.getMessage());

            // toString() - Exception төрөл + мэдээлэл
            System.out.println("toString: " + e.toString());

            // printStackTrace() - Бүрэн мэдээлэл (debugging-д тустай)
            e.printStackTrace();
        }
    }
}
