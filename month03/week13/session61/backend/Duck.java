public class Duck extends Animal implements Flyable, Swimmable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " selj baina.");
    }

    @Override
    public void fly() {
        System.out.println(name + " nisej baina.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Waak waak!");
    }
    
}
