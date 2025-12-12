// Гаралт:
// Данс: ACC001
// Үлдэгдэл: 100000
// 50000 орлого нэмэгдлээ
// Үлдэгдэл: 150000
// Хүү нэмэгдлээ: 7500
// Үлдэгдэл: 157500

import javax.tools.StandardJavaFileManager;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("Exercise 05");
        SavingAccount schoolSavings = new SavingAccount("ACC001", 100000, 0.05);
        schoolSavings.printInfo();
        schoolSavings.deposit(50000);
        schoolSavings.addInterest();
    }
}
