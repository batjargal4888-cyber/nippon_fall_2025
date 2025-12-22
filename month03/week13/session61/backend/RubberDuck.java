public class RubberDuck extends Animal implements Swimmable {

    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " selj baina.");
    }

    @Override
    public void makeSound() {
    System.out.println(name + ": Waak waak!");
    }
    
}