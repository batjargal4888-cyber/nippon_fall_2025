public class Turtle extends Animal implements Swimmable, Jumpable {
    public Turtle(String gender, String kind, String name, int age) {
        super(gender, kind, name, age);
    }

    @Override
    public void gettingOld() {
        setAge(getAge() * 10);
        System.out.println("Turtle is getting old: " + getAge());
    }

    @Override
    public void jump() {
        System.out.println("Turtle can't jump");
    }

    @Override
    public void swim() {
        System.out.println("Turtle can swim");
    }
}
