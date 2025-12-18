public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Жив жив!");
    }

    @Override
    public void move() {
        System.out.println("Nисэж байна");
    }
    
}
