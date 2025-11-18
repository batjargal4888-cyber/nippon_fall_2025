import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {

        // 1.1. ArrayList үүсгэх
        ArrayList<String> colors = new ArrayList<>();

        // 1.2. Өнгө нэмэх
        colors.add("Улаан");
        colors.add("Ногоон");
        colors.add("Цэнхэр");

        // 1.3. Хэмжээг хэвлэх
        System.out.println("Өнгийн тоо: " + colors.size());

        // 1.4. Эхний өнгийг хэвлэх
        System.out.println("Эхний өнгө: " + colors.get(0));

        // 2.1. Array
        ArrayList<Integer> IntNums = new ArrayList<>();

        // 2.2. Add 5 num
        IntNums.add(10);
        IntNums.add(20);
        IntNums.add(30);
        IntNums.add(40);
        IntNums.add(50);

        // 2.3. print size
        System.out.println("Size: " + IntNums.size());

        // 2.4. print last element
        System.out.println("Сүүлчийн тоо: " + IntNums.get(IntNums.size() - 1));

        // 3.1 make array
        ArrayList<String> PeoplaNames = new ArrayList<>();

        // 3.2. give 5 names
        PeoplaNames.add("Болд");
        PeoplaNames.add("Дорж");
        PeoplaNames.add("Цэцэг");
        PeoplaNames.add("Сарнай");
        PeoplaNames.add("Бат");

        // 3.3. first, mid, last index print
        System.out.println("Эхний хүн: " + PeoplaNames.get(0));
        System.out.println("Дундах хүн: " + PeoplaNames.get(PeoplaNames.size() / 2));
        System.out.println("Сүүлчийн хүн: " + PeoplaNames.get(PeoplaNames.size() - 1));

        // 4.1. make array
        ArrayList<String> Cities = new ArrayList<>();
        Cities.add("Улаанбаатар");
        Cities.add("Дархан");
        Cities.add("Эрдэнэт");

        // 4.2. add people
        ArrayList<Integer> CityPopulation = new ArrayList<>();
        CityPopulation.add(1500000);
        CityPopulation.add(100000);
        CityPopulation.add(90000);

        // 4.3. print name & population
        System.out.println(Cities.get(0) + ": " + CityPopulation.get(0));

        // 4.4. print name & population last
        System.out.println(Cities.get(Cities.size() - 1) + ": " + CityPopulation.get(CityPopulation.size() - 1));

        // 5.1. make array
        ArrayList<String> Animals = new ArrayList<>();

        // 5.2. add 4 animals
        Animals.add("Нохой");
        Animals.add("Муур");
        Animals.add("Морь");
        Animals.add("Хонь");

        // 5.3. print size
        System.out.println("Амьтдын тоо: " + Animals.size());

        // 5.4. add numbers on animals
        for (int i = 0; i < Animals.size(); i++) {
            System.out.println((i + 1) + ". " + Animals.get(i));
        }

        // 6.1. Make array
        ArrayList<Integer> IntNum = new ArrayList<>();
        IntNum.add(1);
        IntNum.add(2);
        IntNum.add(3);
        IntNum.add(4);
        IntNum.add(5);
        IntNum.add(6);
        IntNum.add(7);
        IntNum.add(8);
        IntNum.add(9);
        IntNum.add(10);

        // 6.2. print index 0, 4, 9
        System.out.println("Индекс 0: " + IntNum.get(0));
        System.out.println("Индекс 4: " + IntNum.get(4));
        System.out.println("Индекс 9: " + IntNum.get(9));

        // 6.3. print sum20
        int sum = IntNum.get(0) + IntNum.get(4) + IntNum.get(9);
        System.out.println("Нийлбэр: " + sum);

        // 7.1. make array
        ArrayList<String> month = new ArrayList<>();

        // 7.2. add 5 months
        month.add("1 сар");
        month.add("2 сар");
        month.add("3 сар");
        month.add("4 сар");
        month.add("5 сар");

        // 7.3. print using for in reverse
        for (int i = month.size() - 1; i >= 0; i--) {
            System.out.println(month.get(i));
        }

        // 8.1. make array
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);

        // 8.2. print only double integer index
        System.out.println("Хос индекстэй элементүүд:");
        int sum1 = 0;
        for (int i = 0; i < numbers.size(); i += 2) {
            System.out.println(numbers.get(i) + " (индекс " + i + ")");
            sum1 += numbers.get(i);
        }

        // 8.3. print sum
        System.out.println("Нийлбэр: " + sum1);

        // 9.1. make array & add 7 day name
        ArrayList<String> week = new ArrayList<>();
        week.add("Даваа");
        week.add("Мягмар");
        week.add("Лхагва");
        week.add("Пүрэв");
        week.add("Баасан");
        week.add("Бямба");
        week.add("Ням");

        // 9.2. print only odd index
        System.out.println("Сондгой индекстэй өдрүүд:");
        int count = 0;
        for (int i = 0; i < week.size(); i++) {
            if (i % 2 != 0) { // only odd index
                System.out.println(week.get(i) + " (индекс " + i + ")");
                count++;
            }
        }

        // 9.3. print how many day count
        System.out.println("Нийт: " + count + " өдөр");

        // 10.1. make array
        System.out.println();
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(11);
        Numbers.add(22);
        Numbers.add(33);
        Numbers.add(44);
        Numbers.add(55);
        Numbers.add(66);
        Numbers.add(77);
        Numbers.add(88);
        Numbers.add(99);
        Numbers.add(110);

        // 10.2. print 1st 3 element
        int countFromLeft = 3;
        System.out.print("Эхний " + countFromLeft + ": ");
        int firstSum = 0;
        for (int i = 0; i < countFromLeft; i++) {
            System.out.print(Numbers.get(i));
            firstSum += Numbers.get(i);
            if (i < countFromLeft - 1)
                System.out.print(", ");
        }
        System.out.println("\nЭхний " + countFromLeft + "-н нийлбэр: " + firstSum);

        // 10.3. print last 3 elements
        System.out.println();
        int countFromRight = 3;
        System.out.print("Сүүлчийн " + countFromRight + ": ");
        int lastSum = 0;
        for (int i = Numbers.size() - countFromRight; i < Numbers.size(); i++) {
            System.out.print(Numbers.get(i));
            if (i < Numbers.size() - 1)
                System.out.print(", ");
            lastSum += Numbers.get(i);
        }
        System.out.println("\nСүүлчийн " + countFromRight + "-н нийлбэр: " + lastSum);

        // 10.4. Which is bigger sum?
        System.out.println();
        if (firstSum > lastSum) {
            System.out.println("Эхний 3-ын нийлбэр илүү их");
        } else if (firstSum < lastSum) {
            System.out.println("Сүүлчийн 3-ын нийлбэр илүү их");
        } else {
            System.out.println("Нийлбэрүүд тэнцүү байна");
        }

        // 11.1
        System.out.println();
        System.out.println("Дасгал 11: Элемент хайх");
        ArrayList<String> sixCountries = new ArrayList<>();
        sixCountries.add("Япон");
        sixCountries.add("Солонгос");
        sixCountries.add("Монгол");
        sixCountries.add("Хятад");
        sixCountries.add("Орос");
        sixCountries.add("Америк");

        // 11.2. "Монгол" гэсэн улсыг for давталт + get() ашиглан хай
        String search = "Монгол";
        System.out.println("Хайж байна: " + search);

        int foundIndex = -1;

        for (int i = 0; i < sixCountries.size(); i++) {
            if (sixCountries.get(i).equals(search)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Олдлоо!");
            System.out.println("Индекс: " + foundIndex);
            System.out.println("Байрлал: " + (foundIndex + 1) + " дахь");
        } else {
            System.out.println("Олдсонгүй");
        }

        // Дасгал 12: Нийлбэр тооцоолох
        System.out.println();
        System.out.println("Дасгал 12: Нийлбэр тооцоолох");

        // 1. Тоон жагсаалт үүсгэх
        ArrayList<Integer> eightNumbers = new ArrayList<>();
        eightNumbers.add(12);
        eightNumbers.add(25);
        eightNumbers.add(7);
        eightNumbers.add(33);
        eightNumbers.add(18);
        eightNumbers.add(44);
        eightNumbers.add(9);
        eightNumbers.add(51);

        // 2. Нийлбэрийг тооцоолох
        int eightNumbersSum = 0;
        for (int i = 0; i < eightNumbers.size(); i++) {
            eightNumbersSum += eightNumbers.get(i);
        }

        // 3. Дундажийг тооцоолох
        double eightNumbersAverage = (double) eightNumbersSum / eightNumbers.size();

        // 4. Үр дүн хэвлэх
        System.out.println("Тоонууд: " + eightNumbers);
        System.out.println("Нийлбэр: " + eightNumbersSum);
        System.out.println("Дундаж: " + eightNumbersAverage);

        // Дасгал 13: Хамгийн их утга олох
        System.out.println();
        System.out.println("Дасгал 13: Хамгийн их утга олох");

        // 1. ArrayList үүсгээд 10 тоо нэмэх
        ArrayList<Integer> tenNumbers = new ArrayList<>();
        tenNumbers.add(45);
        tenNumbers.add(23);
        tenNumbers.add(67);
        tenNumbers.add(12);
        tenNumbers.add(89);
        tenNumbers.add(34);
        tenNumbers.add(56);
        tenNumbers.add(78);
        tenNumbers.add(25);
        tenNumbers.add(41);

        // 2. Эхний элементийг хамгийн их гэж үзнэ
        int max = tenNumbers.get(0);
        int maxIndex = 0;

        // 3. For давталтаар хамгийн ихийг хайна
        for (int i = 1; i < tenNumbers.size(); i++) {
            if (tenNumbers.get(i) > max) {
                max = tenNumbers.get(i);
                maxIndex = i;
            }
        }

        // 4. Үр дүн хэвлэх
        System.out.println("Хамгийн их утга: " + max);
        System.out.println("Байрлал: индекс " + maxIndex);

        // 🟠 Дасгал 14: Хамгийн бага утга олох
        System.out.println();
        System.out.println("Дасгал 14: Хамгийн бага утга олох");

        // 14.1. ArrayList<Double> үүсгэж, 7 үнэ нэм: 45.5, 23.8, 67.2, 12.3, 89.9,
        // 34.5, 56.1
        ArrayList<Double> prices = new ArrayList<>();

        // Үнүүд нэмэх
        prices.add(45.5);
        prices.add(23.8);
        prices.add(67.2);
        prices.add(12.3);
        prices.add(89.9);
        prices.add(34.5);
        prices.add(56.1);

        // Эхний элементийн утгаар эхлүүлнэ
        double min = prices.get(0);
        double max14 = prices.get(0);

        // For давталтаар хамгийн их ба бага утга олох
        for (int i = 0; i < prices.size(); i++) {
            double p = prices.get(i);

            if (p < min) {
                min = p;
            }
            if (p > max14) {
                max14 = p;
            }
        }

        double diff = max14 - min;

        System.out.println("Хамгийн өндөр үнэ: " + max14 + "₮");
        System.out.println("Хамгийн бага үнэ: " + min + "₮");

        // Зөрүүг зөв гаргах (1 оронгийн нарийвчлалтай)
        System.out.println("Зөрүү: " + String.format("%.1f", diff) + "₮");

        // Дасгал 15: Тодорхой утгатай элемент тоолох
        System.out.println();
        System.out.println("Дасгал 15: Тодорхой утгатай элемент тоолох");
        ArrayList<Integer> scores = new ArrayList<>();

        // Жишээ 15 оноо
        int[] data = { 85, 72, 93, 68, 77, 88, 95, 71, 82, 79, 91, 65, 87, 74, 89 };

        for (int x : data) {
            scores.add(x);
        }

        int count80 = 0;
        int count60_79 = 0;
        int countBelow60 = 0;

        for (int score : scores) {
            if (score >= 80) {
                count80++;
            } else if (score >= 60) {
                count60_79++;
            } else {
                countBelow60++;
            }
        }

        int total = scores.size();

        // хувь тооцоолно
        double p80 = (count80 * 100.0) / total;
        double p60_79 = (count60_79 * 100.0) / total;
        double pBelow = (countBelow60 * 100.0) / total;

        System.out.println("Нийт оноо: " + total);
        System.out.println("80+ оноо: " + count80 + " оюутан (" + String.format("%.1f", p80) + "%)");
        System.out.println("60 - 79 оноо: " + count60_79 + " оюутан (" + String.format("%.1f", p60_79) + "%)");
        System.out.println("60-аас доош: " + countBelow60 + " оюутан (" + String.format("%.1f", pBelow) + "%)");

        //
        // Ахисан түвшний дасгалууд (16-20)
        //

        // Дасгал 16: Тэгш ба сондгой утга ялгах
        System.out.println();
        System.out.println("Дасгал 16: Тэгш ба сондгой утга ялгах");

        // 16.1. Анхны жагсаалт
        ArrayList<Integer> numbers16 = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            numbers16.add(i);
        }

        // 16.2. Тэгш ба сондгой жагсаалтууд
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // 16.3. Тэгш / сондгой ялгалт
        for (int num : numbers16) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // 16.4. Хэвлэлт
        System.out.println("Анхны жагсаалт: " + numbers16.size() + " тоо");
        System.out.println("Тэгш тоо: " + evenNumbers + " - " + evenNumbers.size() + " тоо");
        System.out.println("Сондгой тоо: " + oddNumbers + " - " + oddNumbers.size() + " тоо");

        // Дасгал 17: Давхар ArrayList (2D жагсаалт)
        System.out.println();
        System.out.println("Дасгал 17: Давхар ArrayList (2D жагсаалт)");

        // 1. Багуудын жагсаалт үүсгэх
        ArrayList<Integer> team1 = new ArrayList<>();
        team1.add(85);
        team1.add(90);
        team1.add(78);

        ArrayList<Integer> team2 = new ArrayList<>();
        team2.add(92);
        team2.add(88);
        team2.add(95);

        ArrayList<Integer> team3 = new ArrayList<>();
        team3.add(76);
        team3.add(82);
        team3.add(89);

        // 2. 2D ArrayList
        ArrayList<ArrayList<Integer>> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        // 3. Баг бүрийн дундаж, хамгийн өндөр дундаж
        double maxAverage = 0;
        int maxTeamIndex = -1;

        for (int i = 0; i < teams.size(); i++) {
            ArrayList<Integer> team = teams.get(i);
            double sum17 = 0;
            for (int score : team) {
                sum17 += score;
            }
            double average = sum17 / team.size();
            System.out.printf("Баг %d: %s - Дундаж: %.2f%n", i + 1, team, average);

            if (average > maxAverage) {
                maxAverage = average;
                maxTeamIndex = i;
            }
        }

        System.out.printf("%nХамгийн өндөр дундаж: Баг %d (%.2f)%n", maxTeamIndex + 1, maxAverage);

        // Дасгал 18: Хоёр жагсаалтын нийлбэр
        System.out.println();
        System.out.println("Дасгал 18: Хоёр жагсаалтын нийлбэр");

        // 1. Эхний жагсаалт
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        // 2. Хоёрдугаар жагсаалт
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(15);
        list2.add(25);
        list2.add(35);
        list2.add(45);

        // 3. Шинэ жагсаалт — ижил индекстэй элементүүдийн нийлбэр
        ArrayList<Integer> sum18List = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int sum18 = list1.get(i) + list2.get(i);
            sum18List.add(sum18);
        }

        // 4. Хэвлэлт
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Нийлбэр: " + sum18List);

        // Дасгал 19: Нийтлэг элементүүд (давхар давталт)
        System.out.println();
        System.out.println("Дасгал 19: Нийтлэг элементүүд (давхар давталт)");

        // 1. Эхний жагсаалт
        ArrayList<Integer> list01 = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list01.add(i);
        }

        // 2. Хоёрдугаар жагсаалт
        ArrayList<Integer> list02 = new ArrayList<>();
        for (int i = 5; i <= 10; i++) {
            list02.add(i);
        }

        // 3. Нийтлэг элементүүдийг хадгалах ArrayList
        ArrayList<Integer> common = new ArrayList<>();

        // 4. Давхар for давталт
        for (int i = 0; i < list01.size(); i++) {
            for (int j = 0; j < list02.size(); j++) {
                if (list01.get(i).equals(list02.get(j))) {
                    // Нийтлэг element олдлоо
                    common.add(list01.get(i));
                    break; // дахин нэмэнхгүй
                }
            }
        }

        // 5. Хэвлэлт
        System.out.println("List1: " + list01);
        System.out.println("List2: " + list02);
        System.out.println("Нийтлэг элементүүд: " + common);
        System.out.println("Тоо: " + common.size());

        // Дасгал 20: Оюутны мэдээллийн систем
        System.out.println();
        System.out.println("Дасгал 20: Оюутны мэдээллийн систем");

        // 1. Өгөгдлийг бэлтгэх
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();

        // Өгөгдөл нэмэх
        names.add("Болд");
        grades.add(85);
        cities.add("УБ");
        names.add("Дорж");
        grades.add(92);
        cities.add("Дархан");
        names.add("Цэцэг");
        grades.add(78);
        cities.add("УБ");
        names.add("Сарнай");
        grades.add(95);
        cities.add("Эрдэнэт");
        names.add("Бат");
        grades.add(88);
        cities.add("УБ");

        int totalStudents = names.size();

        // 2. Хамгийн өндөр оноотой оюутан олох
        int maxIndex20 = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(maxIndex20)) {
                maxIndex20 = i;
            }
        }

        // 3. Хамгийн бага оноотой оюутан олох
        int minIndex20 = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < grades.get(minIndex20)) {
                minIndex20 = i;
            }
        }

        // 4. Дундаж оноо
        double sum20 = 0;
        for (int g : grades) {
            sum20 += g;
        }
        double average = sum20 / totalStudents;

        // 5. 80+ оноотой оюутнуудыг тоолох
        int countAbove80 = 0;
        for (int g : grades) {
            if (g >= 80)
                countAbove80++;
        }

        // 6. УБ-аас ирсэн оюутнуудын дундаж
        ArrayList<String> ubStudents = new ArrayList<>();
        double ubSum = 0;
        int ubCount = 0;
        for (int i = 0; i < totalStudents; i++) {
            if (cities.get(i).equals("УБ")) {
                ubStudents.add(names.get(i) + " (" + grades.get(i) + ")");
                ubSum += grades.get(i);
                ubCount++;
            }
        }
        double ubAverage = ubSum / ubCount;

        // 7. Үр дүнг хэвлэх
        System.out.println("========== ОЮУТНЫ МЭДЭЭЛЭЛ ==========");
        System.out.println("\nНийт оюутан: " + totalStudents);

        System.out.println("\nХамгийн өндөр оноо:");
        System.out.println("  Нэр: " + names.get(maxIndex20));
        System.out.println("  Оноо: " + grades.get(maxIndex20));
        System.out.println("  Хот: " + cities.get(maxIndex20));

        System.out.println("\nХамгийн бага оноо:");
        System.out.println("  Нэр: " + names.get(minIndex20));
        System.out.println("  Оноо: " + grades.get(minIndex20));
        System.out.println("  Хот: " + cities.get(minIndex20));

        System.out.println("\nЕрөнхий статистик:");
        System.out.printf("  Дундаж оноо: %.2f%n", average);
        System.out.println("  80+ оноотой: " + countAbove80 + " оюутан ("
                + String.format("%.1f", (countAbove80 * 100.0 / totalStudents)) + "%)");

        System.out.println("\nУБ-аас ирсэн оюутнууд:");
        System.out.println("  Тоо: " + ubCount + " оюутан");
        System.out.printf("  Дундаж оноо: %.2f%n", ubAverage);
        System.out.println("  Жагсаалт: " + String.join(", ", ubStudents));
    }
}