public class Main {
    public static void main(String[] args) {
        System.out.println("Session 96");

        // 1. Animal
        Animal animal = new Animal();
        animal.speak();

        Animal cat = new Animal();
        cat.speak("Мяууу");

        // 2. Calculator
        Calculator calc = new Calculator();

        int result1 = calc.add(5, 3);
        System.out.println("5 + 3 = " + result1);

        int result2 = calc.add(5, 3, 2);
        System.out.println("5 + 3 + 2 = " + result2);

        double result3 = calc.add(2.5, 3.7);
        System.out.println("2.5 + 3.7 = " + result3);

        // dasgal 3
        Animal pet = new Animal();
        Dog dog = new Dog();
        Cat catAnimal = new Cat();

        pet.makeSound();
        dog.makeSound();
        catAnimal.makeSound();

        // dasgal 4
        System.out.println("\nEx 4");
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();

        // Ex 5
        System.out.println("\nEx 5");
        Circle circle = new Circle(5.0);
        circle.describe();
        System.out.printf("Талбай: %.2f\n", circle.area());
        circle.describe("улаан");

        // Ex 6
        System.out.println("\nEx 6");
        
        Warrior warrior = new Warrior("Болд");
        Paladin paladin = new Paladin("Артур");

        warrior.showInfo();
        warrior.attack();

        paladin.showInfo();
        paladin.attack();
        paladin.heal();
    }
}