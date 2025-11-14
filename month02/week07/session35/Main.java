public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // 3 ном нэмэх
        lib.addBook(new Book("GOT", "J.R.R Martin"));
        lib.addBook(new Book("LOTR", "J.R.R Tolkien"));
        lib.addBook(new Book("Harry Potter", "J.K Rowling"));

        System.out.println("Бүх ном:");
        lib.printAllBooks();

        // Ном устгах
        System.out.println("\n'Clean Code' номыг устгаж байна. . .");
        lib.removeBookByTitle("Clean Code");

        System.out.println("\nҮлдсэн номнууд:");
        lib.printAllBooks();

        // Даалгавар 3: JDBC-ээс дундаж үнэлгээ авах
        lib.printAverageRating();
    }
}