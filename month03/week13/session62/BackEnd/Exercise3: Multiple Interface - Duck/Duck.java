public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Ваак ваак!");
    }

    @Override
    public void fly() {
        System.out.println(name + " нисэж байна!");
    }

    @Override
    public void swim() {
        System.out.println(name + " сэлж байна!");
    }
}