class Main {
    public static void main(String[] args) {
        Calculator basicCalculator = new Calculator(10, 15);
        System.out.println(basicCalculator.a + basicCalculator.b);
        System.out.println(basicCalculator.minus());
        System.out.println(basicCalculator.multiply());
        System.out.println(basicCalculator.division());

        // 
        // Java Exercises
        //

        // 1. Оюутны Дүн Шалгагч
        Student s1 = new Student("Болд", 85);
        Student s2 = new Student("Цэцэг", 55);

        System.out.println(s1.name + "-н дүн: " + s1.getPassStatus());
        System.out.println(s2.name + "-н дүн: " + s2.getPassStatus());

        // 2. Тооцоолуур Класс
        Calculator01 calc = new Calculator01();
        int result = calc.sumUpTo(10);
        System.out.println("1-ээс 10 хүртэлх тооны нийлбэр: " + result);

        // 3. Барааны Жагсаалт (1D Массивтай)
        String[] myItems = {"Сүү", "Талх", "Өндөг"};
        Inventory myStore = new Inventory(myItems);

        System.out.println("Талх бий юу? " + myStore.findItem("Талх"));
        System.out.println("Цай бий юу? " + myStore.findItem("Цай"));
    }    
}