class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Блүб блүб...");
    }

    @Override
    public void swim() {
        System.out.println("🏊 " + name + " хурдан сэлж байна!");
    }
}