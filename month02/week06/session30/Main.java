public class Main {
    // 1. Турших main function
    public static void main(String[] args) {
        Book myBook = new Book("Тунгалаг тамир", "Ч.Лодойдамба");
        myBook.printInfo();
    // 2. Массивын дунджийг олох
        int[] scores = {80, 90, 100, 75};
        double avg = AverageCalculator.calculateAverage(scores);
        System.out.println("Дундаж оноо: " + avg);
    // 3. Эгшиг тоолох
        int vowels = VowelCounter.countVowels("Hello, Java World!");
        System.out.println("Нийт эгшгийн тоо: " + vowels);
    // 4. Тоог урвуулах
        int reversed = ReverseNumber.reverseInteger(12345);
        System.out.println("12345-ыг урвуулбал: " + reversed);
    // 5. 2D massive-аас хамгийн их тоог олох
        int[][] myMatrix = {
            {1, 5, 3},
            {9, 2, 8},
            {4, 7, 6}
        };
        int maxVal = MatrixMaxFinder.findMaxInMatrix (myMatrix);
        System.out.println("Матрицын хамгийн их утга: " + maxVal);
    }
}
