public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Exercise 03");
        Vehicle Toyota = new Vehicle("Toyota");
        Toyota.start();

        Car Honda = new Car("Honda");
        Honda.start();

        ElectricCar Tesla = new ElectricCar("Tesla");
        Tesla.start();
    }
}
