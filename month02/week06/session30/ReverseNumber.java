public class ReverseNumber {
    // Тоог урвуулан буцаах function
    public static int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;            // хамгийн сүүлийн цифрийг авна
            reversed = reversed * 10 + lastDigit;   // урвуу тоонд нэмж оруулах
            number = number / 10;                   // хамгийн сүүлийн цифрийг хасна
        }
        return reversed;
    }
}