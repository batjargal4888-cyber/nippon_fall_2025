class Duck extends Animal implements Flyable, Swimmable, Walkable {
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Ваак ваак!");
    }

    @Override
    public void fly() {
        System.out.println("🕊️  " + name + " нисэж байна!");
    }

    @Override
    public void swim() {
        System.out.println("🏊 " + name + " нуурт сэлж байна!");
    }

    @Override
    public void walk() {
        System.out.println("🚶 " + name + " явган явж байна...");
    }
}