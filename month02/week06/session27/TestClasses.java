package week06.session27;
public class TestClasses {
    public static void main(String[] args) {
        Book monteChristo = new Book();
        System.out.println(monteChristo);
        System.out.println(monteChristo.bookName);
        System.out.println(monteChristo.isbnNumber);
        System.out.println(monteChristo.publishedDate);
        monteChristo.bookName = "Graf Monte Christo";
        monteChristo.isbnNumber = "345614376758";
        monteChristo.publishedDate = "1846-Jan-15";
        System.out.println(monteChristo.bookName);
        System.out.println(monteChristo.isbnNumber);
        System.out.println(monteChristo.publishedDate);
    }
}