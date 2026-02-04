// Engine class
class Engine {
    // start the engine
    void start() {
        System.out.println("Engine started");
    }

    // stop the engine
    void stop() {
        System.out.println("Engine stopped");
    }
}

// Car class using composition
class Car {
    // Car HAS an Engine
    private Engine engine;

    // constructor creates an Engine
    public Car() {
        engine = new Engine();
    }

    // start the car
    void startCar() {
        engine.start();
        System.out.println("Car is starting");
    }

    // stop the car
    void stopCar() {
        engine.stop();
        System.out.println("Car is stopping");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // create a car object
        Car car = new Car();
        // use the car
        car.startCar();
        car.stopCar();
    }
}
