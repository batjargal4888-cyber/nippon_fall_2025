public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " идэж байна...");
    }

    public void sleep() {
        System.out.println(name + " унтаж байна...");
    }

    public void displayInfo() {
        System.out.println("Нэр: " + name);
        System.out.println("Нас: " + age + " настай");
    }
}