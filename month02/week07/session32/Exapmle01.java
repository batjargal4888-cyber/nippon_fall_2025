import java.util.ArrayList;

public class Exapmle01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        // 3 бутархай тоо агуулсан arrayList үүсгэнэ үү
        ArrayList<Double> number = new ArrayList<Double>();
        number.add(13.5);
        number.add(14.8);
        number.add(5.2);
        System.out.println(number);

        // зөвхөн бүхэл тоо агуулсан list
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(1);
        numberList.add(9);
        System.out.println(numberList);

        // access list
        System.out.println(fruits.get(1)); // banana
        System.out.println(fruits.get(2)); // orange

        //change elements буюу banana-г mango-гоор солих
        fruits.set(1, "Mango");
        System.out.println(fruits);

        // remove elements
        fruits.remove("Apple"); // [Mango, Orange]
        fruits.remove(0); // [Orange]
        System.out.println(fruits);

        // find size
        System.out.println("Size: " + fruits.size());
        // add 2 elements
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        System.out.println("Size: " + fruits.size());

        // loop 01
        for (int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // loop 02
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // clear array List
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
