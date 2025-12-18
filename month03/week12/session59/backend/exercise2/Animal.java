public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public abstract void move();

    public void sleep() {
        System.out.println(name + " untaj baina...");
    }
    
}
