public class Dog {

    // 1. Хувьсагч (Instance Variable)
    String name;

    // 2. Функц (Method)
    public void bark() {
        System.out.println("Woof! My name is " + name + "!");
    }

    // 3. Main method - test хийх хэсэг
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Dog class-ийн object үүсгэх
        myDog.name = "Buddy"; // name хувьсагчид утга оноох
        myDog.bark(); // bark() функцийг дуудах
    }

}
