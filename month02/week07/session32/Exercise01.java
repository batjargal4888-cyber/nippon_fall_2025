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

        // 6.3. print sum
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
        for (int i = 0; i < week.size(); i ++) {
            if (i % 2 != 0) { // only odd index
                System.out.println(week.get(i) + " (индекс " + i + ")");
                count++;
            }
        }

        // 9.3. print how many day count
        System.out.println("Нийт: " + count + " өдөр");

        // 10.1. make array
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
        int chosenNumber = 3;

        // 10.2. print 1st 3 element
        System.out.print("Эхний " + chosenNumber + ": ");
        int firstSum = 0;
        for (int i = 0; i < chosenNumber; i++) {
            System.out.print(Numbers.get(i));
            firstSum += Numbers.get(i);
            if (i < chosenNumber - 1) System.out.print(", ");
        }
        System.out.println("\nЭхний " + chosenNumber + "-ын нийлбэр: " + firstSum);
    }
}
