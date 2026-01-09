public class StudentList {

    private String name;
    private int age;
    private double score;

    // Constructor
    public StudentList(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    // Setter (оноо өөрчлөхөд хэрэгтэй)
    public void setScore(double score) {
        this.score = score;
    }

    // CSV хэлбэрт оруулах
    public String toCSV() {
        return name + ", " + age + ", " + score;
    }

    @Override
    public String toString() {
        return name + " | Нас: " + age + " | Оноо: " + score;
    }
}
