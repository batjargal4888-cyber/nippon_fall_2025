public class ElectricCar extends Car {
    
    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " chimeegui asaj baina.");
    }
}
