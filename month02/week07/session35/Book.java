public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Нэр: " + this.title + ", Зохиогч: " + this.author);
    }
}
