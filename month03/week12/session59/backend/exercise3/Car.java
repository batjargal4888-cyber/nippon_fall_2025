public class Car extends Vehicle {
    int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    void start() {
        System.out.println("Түлхүүрээр асаж байна");
    }

    @Override
    void stop() {
        System.out.println("Тоормос дарж зогсож байна");
    }

    @Override
    double getFUelEfficiency() {
        return 12.5;
    }

    @Override
    void displayInfo() {
        System.out.println("===== Машин =====");
        System.out.println(brand + " " + model + " (" + year + ")");
        System.out.println("Haalga: " + numDoors);
    }

}
