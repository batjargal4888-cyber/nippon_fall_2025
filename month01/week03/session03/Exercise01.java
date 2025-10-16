class Exercise01 {
    public static void main(String[] args){
      
      // 1. Нас
      int myAge = 25;
      System.out.println("My age: " + myAge);
      
      // 2. Кофены үнэ
      double coffeePrice = 3.5;
      System.out.println("Coffee price: " + coffeePrice);

      // 3. Нийт үнэ
      double totalPrice = coffeePrice * 4;
      System.out.println("Total price for 4 coffee: " + totalPrice);

      // 4. Үлдсэн зай
      int distanceLeft = 100 - 42;
      System.out.println("Distance left: " + distanceLeft);

      // 5. Онооны өөрчлөлт
      int score = 0;
      score = score + 150;
      score = score - 40;
      System.out.println("Final score: " + score);

      // 6. Бүхэл хуваагдал
      int candiesPerChild = 25 / 4;
      System.out.println("Candies per child: " + candiesPerChild);

      // 7. Үлдэгдэл олох
      int candiesLeftover = 25 % 4;
      System.out.println("Candies leftover: " + candiesLeftover);

      // 8. Дундын дүн
      double averageScore = ( 88 + 92 + 79 ) / 3.0;
      System.out.println("Average score: " + averageScore);

      // 9. Сурагчийн мэдээлэл
      char studentGrade = 'A';
      boolean isPassing = true;
      System.out.println("Student grade: " + studentGrade);
      System.out.println("Is passing: " + isPassing);

      // 10. Дэлгүүрийн тооцоо
      double totalCost = ( 5000 * 2 ) + ( 3200 * 3 );
      double finalBill = totalCost * 1.10; // 10% НӨАТ
      System.out.println("Final bill: " + finalBill + "$");

    }
}