public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2022, 600);
        car.displayInfo();
        car.start();
        car.stop();
        System.out.println("Түлшний зарцуулалт: " + car.getFUelEfficiency() + "  км/л");
        System.out.println();
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Түлшний зарцуулалт: " + motorcycle.getFUelEfficiency() + " км/л");
    }

}
