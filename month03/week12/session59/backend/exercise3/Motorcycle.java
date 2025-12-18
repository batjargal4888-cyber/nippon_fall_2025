public class Motorcycle extends Vehicle {
    int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    void start() {
        System.out.println("Киккээр асаж байна");
    }

    @Override
    void stop() {
        System.out.println("Хөлөөр тоормослож байна");
    }

    @Override
    double getFUelEfficiency() {
        return 25.0;
    }

    @Override
    void displayInfo() {
        System.out.println("===== Мотоцикл =====");
        System.out.println(brand + " " + model + " (" + year + ")");
        System.out.println("Хөдөлгүүр: " + engineCC + "cc");
    }

}
