public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                    🦁 ANIMAL KINGDOM 🦁                      ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        // Амьтад үүсгэх
        Bird eagle = new Bird("Бүргэд", 5);
        Fish fish = new Fish("Алтан загас", 2);
        Dog dog = new Dog("Бодой", 3);
        Duck duck = new Duck("Дональд", 4);
        // ===== Bird =====
        System.out.println("\n===== 🐦 Шувуу: Бүргэд =====");
        eagle.displayInfo();
        eagle.makeSound();
        eagle.eat();
        eagle.fly();
        eagle.walk();
        // ===== Fish =====
        System.out.println("\n===== 🐟 Загас: Алтан загас =====");
        fish.displayInfo();
        fish.makeSound();
        fish.eat();
        fish.swim();
        // ===== Dog =====
        System.out.println("\n===== 🐕 Нохой: Бодой =====");
        dog.displayInfo();
        dog.makeSound();
        dog.eat();
        dog.walk();
        // ===== Duck =====
        System.out.println("\n===== 🦆 Нугас: Дональд =====");
        duck.displayInfo();
        duck.makeSound();
        duck.eat();
        duck.fly();
        duck.swim();
        duck.walk();
        // ===== Flyers =====
        System.out.println("\n╠══════════════════════════════════════════════════════════════╣");
        System.out.println("║                     ✈️  НИСЭГЧИД                              ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        eagle.fly();
        duck.fly();
        // ===== Swimmers =====
        System.out.println("\n╠══════════════════════════════════════════════════════════════╣");
        System.out.println("║                     🏊 СЭЛЭГЧИД                              ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        fish.swim();
        duck.swim();
        // ===== Walkers =====
        System.out.println("\n╠══════════════════════════════════════════════════════════════╣");
        System.out.println("║                     🚶 АЛХАГЧИД                              ║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        eagle.walk();
        dog.walk();
        duck.walk();

        System.out.println("\n╚══════════════════════════════════════════════════════════════╝");
    }
}