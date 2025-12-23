class Dog extends Animal implements Walkable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Ав ав!");
    }

    @Override
    public void walk() {
        System.out.println("🚶 " + name + " гүйж байна!");
    }
}