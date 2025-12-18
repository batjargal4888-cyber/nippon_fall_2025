public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Engiin method - buh amitand ijil
    public void sleep() {
        System.out.println(name + " untaj baina.");
    }

    // Abstract method - amitan bur uuruur heregjuulne.
    public abstract void makeSound();
    
}
