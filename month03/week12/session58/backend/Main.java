public class Main {
    // 1. class extension
    // 2. method override
    // 3. method overload
    public static void main(String[] args) {
        // Animal wildAnimal = new Animal('Animal')
        Dog bodoi = new Dog("Bodoi");
        bodoi.sleep();
        bodoi.makeSound();

        Cow myCow = new Cow("Cow");
        myCow.sleep();
        myCow.makeSound();
    }
}
