public abstract class Animal {
    private String gender; // property
    private String kind;
    private String name;
    private int age;

    public Animal(String gender, String kind, String name, int age) {
        this.gender = gender;
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void gettingOld();
}
