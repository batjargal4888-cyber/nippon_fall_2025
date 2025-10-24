class ExerciseLoops {
    static void main(String[] args) {
        // Java-гийн Үндсэн Дасгалууд (Loops & Conditionals)
        // A. Үндсэн for давталт (Easy)
        // 1. Тоо хэвлэх: 1-ээс 10 хүртэлх тоог хэвлэ.
        System.out.println("1. Тоо хэвлэх:");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        // 2. Ухраан тоолох: 10-аас 1 хүртэлх тоог ухраан хэвлэ.
        System.out.println("2. Ухраан тоолох:");
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        // 3. Үсэг хэвлэх: "Hello" гэдэг үгийг 5 удаа хэвлэ.
        System.out.println("3. Үсэг хэвлэх:");
        for (int c = 1; c <= 5; c++) {
            System.out.println("Hello");
        }
        // 4. Тэгш тоо: 1-ээс 20 хүртэлх бүх тэгш тоог хэвлэ.
        System.out.println("4. Тэгш тоо:");
        for (int d = 1; d <= 20; d++) {
            if (d % 2 == 0) {
                System.out.println(d);
            }
        }
        // B. Давталтан дахь Нөхцөл (if/else) (Easy)
        // 1. Тэгш эсвэл Сондгой: 1-ээс 10 хүртэлх тоог давтаж, тоо тус бүрийн ард
        // "тэгш" эсвэл "сондгой" гэж хэвлэ.
        System.out.println("1. Тэгш эсвэл Сондгой:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - тэгш");
            } else {
                System.out.println(i + " - сондгой");
            }
        }
        // 2. 3-т хуваагдах: 1-ээс 30 хүртэлх тоонуудаас зөвхөн 3-т хуваагддаг тоонуудыг
        // хэвлэ.
        System.out.println("3-т хуваагдах:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        // 3. FizzBuzz (Эхний хэсэг): 1-ээс 50 хүртэл тоол. Хэрэв тоо 3-т хуваагддаг бол
        // тооны оронд "Fizz", 5-д хуваагддаг бол "Buzz", харин 3 ба 5-ууланд нь
        // хуваагддаг бол "FizzBuzz" гэж хэвлэ. Бусад тохиолдолд тоог өөрөөр нь хэвлэ.
        System.out.println("FizzBuzz (Эхний хэсэг):");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        // 4. Аюултай тоо: 7-д хуваагддаг эсвэл 7-гийн цифр агуулсан (17, 27 гэх мэт)
        // 1-ээс 50 хүртэлх тоонуудыг алгасаж, бусдыг нь хэвлэ.
        System.out.println("Аюултай тоо:");
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0 || String.valueOf(i).contains("7")) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        // C. Тооцоолол ба Нийлбэр (Easy - Intermediate)
        // 1. Нийлбэр олох: 1-ээс 100 хүртэлх бүх тооны нийлбэрийг ол.
        System.out.println("Нийлбэр олох:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1-ээс 100 хүртэлх бүх тооны нийлбэр: " + sum);
        // Сондгой тооны нийлбэр: 1-ээс 50 хүртэлх бүх сондгой тооны нийлбэрийг ол.
        System.out.println("Сондгой тооны нийлбэр:");
        int sum2 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println("1-ээс 50 хүртэлх бүх сондгой тооны нийлбэр: " + sum2);
        // Дундаж олох: 1-ээс 10 хүртэлх тооны арифметик дунджийг ол.
        System.out.println("Дундаж олох:");
        int sum1to10 = 0;
        double counter = 0;
        for (int i = 1; i <= 10; i++) {
            sum1to10 = sum1to10 + i;
            counter++;
        }
        System.out.println("1-ээс 10 хүртэлх тооны арифметик дундаж: " + sum1to10 / counter);
        // Факториал: Хэрэглэгчээс нэг тоо авч (жишээ нь int n = 5;), түүний факториалыг
        // ол (5! = 5 * 4 * 3 * 2 * 1).
        System.out.println("Факториал:");
        int n = 6;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(n + " факториал = " + factorial);
    }
}
