import java.util.ArrayList;
class Example02 {
    public static void main(String[] args) {
        // 1. ArrayList-д хотуудын нэрийг өгөөд хэвлэнэ үү.
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        System.out.println(cities);

        // 2. Шинээр 5 оюутнуудын нэрийг хадгалсан ArrayList үүсгээд
        // түүнийхээ 2 дахь болон 4 дэх нэрийг хэвлэнэ үү.
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Бат");
        Students.add("Болд");
        Students.add("Сүх");
        Students.add("Готов");
        Students.add("Дорж");
        System.out.println("2 дахь нэр: " + Students.get(1));
        System.out.println("4 дэх нэр: " + Students.get(3));

        // 3. Integer төрөлтэй бүхэл тоо хадгалдаг Arraylist үүсгэнэ үү.
        // - 5 тоо нэмнэ үү.
        // 3-р дугаар тоог 100-гаар солино уу.
        // Эхний тоог устгана уу.
        // Тэгээд сүүлчийн list-ийг устгана уу.
        ArrayList<Integer> IntNums = new ArrayList<Integer>();
        IntNums.add(0);
        IntNums.add(1);
        IntNums.add(2);
        IntNums.add(3);
        IntNums.add(4);
        IntNums.set(2, 100);
        IntNums.remove(0);
        IntNums.clear();
        System.out.println(IntNums);

        // 4. FavouriteFoods нэртэй ArrayList үүсгээд түүндээ 5 хоолны нэр нэмээд
        // тэгээд for loop ашиглан бүх нэрийг хэвлэнэ үү.
        ArrayList<String> FavouriteFoods = new ArrayList<String>();
        FavouriteFoods.add("Цуйван");
        FavouriteFoods.add("Будаатай хуурга");
        FavouriteFoods.add("Банштай цай");
        FavouriteFoods.add("Лапша");
        FavouriteFoods.add("Бифштекс");
        // loop 01
        for (int i = 0; i < FavouriteFoods.size(); i++) {
            System.out.println(FavouriteFoods.get(i));
        }
        // loop 02
        for (String FavouriteFood: FavouriteFoods) {
            System.out.println(FavouriteFood);
        }
    }
}
