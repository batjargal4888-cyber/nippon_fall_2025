public class Bird extends Animal implements Flyable, Walkable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Чив чив!");
    }

    @Override
    public void fly() {
        System.out.println("🕊️  " + name + " өндөрт нисэж байна!");
    }

    @Override
    public void walk() {
        System.out.println("🚶 " + name + " алхаж байна...");
    }
}
