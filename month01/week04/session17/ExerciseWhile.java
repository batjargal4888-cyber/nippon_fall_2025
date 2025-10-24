class ExerciseWhile {
    public static void main(String[] args) {
        // Java while Давталтын 10 Энгийн Дасгал
        // 1. 10-аас 1 хүртэл тоолох
        System.out.println("1st Loop:");
        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a = a - 1;
        }
        // 2. 1-ээс 5 хүртэл тоолох
        System.out.println("2nd Loop:");
        int b = 1;
        while (b <= 5) {
            System.out.println(b);
            b = b + 1;
        }
        // 3. Нийлбэр 20-оос хэтрэх
        System.out.println("3rd Loop:");
        int c = 1;
        int sum = 0;
        while (sum <= 20) {
            System.out.println(c);
            sum = sum + c;
            c++;
        }
        System.out.println("Нийлбэр 20-оос давлаа: " + sum);
        // 4. Анхны тэгш тоог олох
        System.out.println("4th Loop: ");
        int d = 7;
        while (d >= 7) {
            if (d % 2 == 0) {
                System.out.println("7-оос хойших анхны тэгш тоо: " + d);
                break;
            }
            d++;
        }
        // 5. Тоог 100-аас их болтол 2-оор үржүүлэх
        System.out.println("5th Loop:");
        int e = 2;
        while (e < 100) {
            e = e * 2;
            System.out.println(e);
        }
        // 6. "Шидэт үг" олох
        System.out.println("6th Loop");
        String magicWord = "open sesame";
        String guess = "abracadabra";
        int attempts = 0;
        while(!guess.equals(magicWord)) {
            System.out.println("Буруу үг. Дахин оролдоно уу...");
            attempts++;
            if(attempts == 2) {
                guess = "open sesame";
            }
        }
        System.out.println("Үүд нээгдлээ!");
        // 7. Мөнгө хуримтлуулах
        System.out.println("7th Loop");
        int totalMoney = 10;
        while (totalMoney < 50) {
            System.out.println(totalMoney + " ₮");
            totalMoney = totalMoney + 10;
        }
        System.out.println("Нийт хуримтлал " + totalMoney + " ₮ хүрлээ!");
        // 8. Батарей цэнэг дуусах
        System.out.println("8th Loop");
        int batteryPercent = 100;
        while (batteryPercent >= 20) {
            System.out.println("Одоогийн цэнэг: " + batteryPercent + "%");
            batteryPercent = batteryPercent - 5;
        }
        System.out.println("Цэнэг дуусч байна... Одоогийн цэнэг: " + batteryPercent + " %");
        // 9. Тоог 0-ээс бага болтол 7-оор хорогдуулах (Шинэ дасгал)
        System.out.println("9th Loop");
        int f = 50;
        while (f >= 0) {
            System.out.println(f);
            f = f - 7;
        }
        System.out.println(f);
        // 10. Од хэвлэх
        System.out.println("10th Loop");
        int star = 1;
        while (star <= 7) {
            System.out.print("*");
            star++;
        }
        System.out.println("");
    }
}
