public class JavaExercises {
    public static void main(String[] args) {

        // 1. Тоолуурын Хүрээ (Variable Scope)
        System.out.println();
        System.out.println("1.");
        int outerVar = 100;
        for (int i = 0; i < 3; i++) {
            int innnerVar = i;
            System.out.println("Inner: " + innnerVar);
        }
        System.out.println("Outer: " + outerVar);
        // System.out.println("Inner: " + innnerVar); // For-ийн гадна бол энэ мөр алдаа
        // заана.

        // 2. Тэгш тоогоор ухраан тоолох (while)
        System.out.println();
        System.out.println("2.");
        int number = 20;
        while (number >= 0) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number--; // 1-ээр бууруулах
        }

        // 3. 3 эсвэл 5-ын үржвэрүүдийн нийлбэр (for)
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("3.");
        int sum = 0;
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; // нийлбэрт нэмнэ
            }
        }
        System.out.println("Нийлбэр: " + sum);

        // 4. Үсгэн гурвалжин (for)
        System.out.println();
        System.out.println("4.");
        char endChar = 'E';
        for (char outer = 'A'; outer <= endChar; outer++) { // мөр бүрт
            for (char inner = 'A'; inner <= outer; inner++) { // тухайн мөрөнд хэвлэх үсгүүд
                System.out.print(inner);
            }
            System.out.println(); // шинэ мөр
        }

        // 5. Тоо таах (Энгийн симуляци while)
        System.out.println();
        System.out.println("5.");
        int secretNumber = 7;
        int guess = 0;
        int attempts = 0;
        while (guess != secretNumber) {
            // user enters number
            guess = (int)(Math.random() * 10) + 1; // random number 1 - 10
            System.out.println("Guessing. . . " + guess);
            if (guess != secretNumber) {
                System.out.println("Wrong!");
            }
            attempts++;
        }
        System.out.println("Correct guess!");
        System.out.println("Number of guess: " + attempts);
    }
}
