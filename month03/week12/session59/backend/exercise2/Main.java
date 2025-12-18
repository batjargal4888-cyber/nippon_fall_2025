public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Dog("Bodoi");
        Animal cat = new Cat("Miguu");
        Animal bird = new Bird("Chirguul");

        dog.makeSound();
        dog.move();
        dog.sleep();

        cat.makeSound();
        cat.move();
        cat.sleep();

        bird.makeSound();
        bird.move();
        bird.sleep();

    }
}
