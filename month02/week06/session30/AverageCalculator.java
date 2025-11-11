public class AverageCalculator {
    // 2. calculateAverage function - massive-ийн дундажийг тооцоол
    public static double calculateAverage(int[] numbers) {
        int sum = 0; // нийлбэр хадгалах хувьсагч
        for(int n : numbers) {
            sum += n;
        }
        // дундаж = нийлбэр / number of elements
        return(double) sum / numbers.length;
    }
}
