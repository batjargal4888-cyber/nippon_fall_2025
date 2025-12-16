public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " tulhuureer asaj baina.");
    }
    
}
