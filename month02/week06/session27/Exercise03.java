public class Exercise03 {

    static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myNumbers = {10, 5, 20, 1};
        int total = sumArray(myNumbers);
        System.out.println("Массивын нийлбэр: " + total);
    }
}
