class Main {
    public static void main(String[] args) {
        Animal hulgana = new Animal();
        System.out.println(hulgana.animalAge);
        System.out.println(hulgana.animalName);
        // 2 настай хулгана гэдэг болгоод харуулна уу
        hulgana.animalAge = 2;
        hulgana.animalName = "Mouse";
        System.out.println(hulgana.animalAge);
        System.out.println(hulgana.animalName);

        Human Batja = new Human("Batja", "Male");
        System.out.println(Batja.name);
        System.out.println(Batja.gender);

        // 2 хүн төрлийн object үүсгээд property-нуудыг нь хэвлэх дээ
        // намайг Батжа гэдэг би Male гэж хэвлэдэг болгоно уу
        Human Batjargal = new Human("Б.Батжаргал", "эрэгтэй");
        System.out.println("Миний бүтэн нэрийг " + Batjargal.name + " гэдэг. Би " + Batjargal.gender + " хүн.");

        Human BJ = new Human("BJ", "female");
        System.out.println("Hey, my name is " + BJ.name + "." + " I am a " + BJ.gender + " human.");

        // 1. Тооны тэмдгийг шалгах
        Exercise01 ex = new Exercise01();
        System.out.println("5-ын тэмдэг: " + ex.checkSign(5));
        System.out.println("-3-ын тэмдэг: " + ex.checkSign(-3));

        // 2. Үгийн олон удаа хэвлэх
        Exercise02 ex2 = new Exercise02();
        ex2.repeatWord("Java", 3);

        // 3. N хүртэлх тооны нийлбэр олох
        Exercise03 ex3 = new Exercise03();
        int result = ex3.sumUpTo(5);
        System.out.println("1-ээс 5 хүртэлх тооны нийлбэр: " + result);

        // 4. Энгийн "Нохой" Класс бүтээх
        Dog myDog = new Dog(); // 'Dog' классын шинэ объект үүсгэх
        myDog.name = "Банхар"; // Объектын хувьсагчид утга оноох
        myDog.bark(); // Объектын функцийг дуудах
    }
}
