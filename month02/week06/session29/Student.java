public class Student {
    // 1. Оюутны Дүн Шалгагч
    String name;
    int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Тэнцсэн эсэхийг шалгах функц (ternary оператор ашиглаж)
    public String getPassStatus() {
        return (score >= 60) ? "Pass" : "Fail";
    }
}
