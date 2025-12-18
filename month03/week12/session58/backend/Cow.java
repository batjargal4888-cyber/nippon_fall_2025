public class Cow extends Animal{
    
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Umbuu umbuu!");
    }
}
