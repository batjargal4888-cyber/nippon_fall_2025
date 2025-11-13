public class Book {
    String title; // property
    String author; // property

    // constructor - байгуулагч
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // class method
    public void printInfo () {
        System.out.println("Нэр: " + this.title + ", Зохиогч: " + this.author);
    }
}