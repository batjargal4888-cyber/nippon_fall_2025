public class Book {
    // 1. Instance хувьсагчид
    String title;
    String author;
    // 2. Constructor - анхны утгуудыг тохируулах
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // 3. printInfo() - мэдээлэл хэвлэх method
    public void printInfo() {
        System.out.println("Нэр: " + title + ", Зохиогч: " + author);
    }
}