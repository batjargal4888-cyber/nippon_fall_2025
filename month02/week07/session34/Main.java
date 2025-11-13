import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // harryPotter Object
        Book harryPotter = new Book ("Harry Potter: Half Blood Prince", "J.K.Rowling");
        Book lordOfTheRings = new Book ("Two tower", "J.R.R.Tolkien");
        Book gameOfThrones = new Book ("Fire and Blood", "R.R.Martin");
        // ArrayList-ийн Library үүсгэе
        ArrayList<Book> Library = new ArrayList<>();
        Library.add(harryPotter);
        Library.add(lordOfTheRings);
        Library.add(gameOfThrones);
        System.out.println(Library);

        // for-each давталт
        for (Book book: Library) {
            book.printInfo();
        }
        // for loop
        for (int i = 0; i < Library.size(); i++) {
            Library.get(i).printInfo();
        }

        int[] numbers = {1, -10, 4, 5};
        // доош нь цувуулж хэвлэж харуулна уу. for loop ашиглаарай.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}