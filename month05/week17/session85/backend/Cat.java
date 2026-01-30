public class Cat extends Animal implements Swimmable, Jumpable {
    public Cat(String gender, String kind, String name, int age) {
        super(gender, kind, name, age);
    }

    // cat 2 nasaar hunii jileer hugshirnu
    @Override
    public void gettingOld() {
        setAge(getAge() * 2);
        System.out.println("Cat is getting old: " + getAge());
    }

    @Override
    public void jump() {
        System.out.println("Cat can jump");
    }

    @Override
    public void swim() {
        System.out.println("Cat can swim");
    }
}
