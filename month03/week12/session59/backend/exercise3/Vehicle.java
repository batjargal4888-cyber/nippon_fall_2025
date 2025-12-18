public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    abstract void start();

    abstract void stop();

    abstract double getFUelEfficiency();

    abstract void displayInfo();
}
