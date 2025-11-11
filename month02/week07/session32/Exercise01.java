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


    }
}
