public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void skeep() {
        System.out.println(name + " untaj baina.");
    }
}
