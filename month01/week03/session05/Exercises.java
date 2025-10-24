class Exercises {
    public static void main(String[] args) {
        System.out.println("Session 15 - Java conditional Exercise");

        // 7 хоногийн гариг.
        int weekdayNumber = 1;
        if (weekdayNumber == 1) {
            System.out.println("Monday");
        } else if (weekdayNumber == 2) {
            System.out.println("Tuesday");
        } else if (weekdayNumber == 3) {
            System.out.println("Wednesday");
        } else if (weekdayNumber == 4) {
            System.out.println("Thursday");
        } else if (weekdayNumber == 5) {
            System.out.println("Friday");
        } else if (weekdayNumber == 6) {
            System.out.println("Saturday");
        } else if (weekdayNumber == 1) {
            System.out.println("Sunday");
        } else {
            System.out.println("Insert number between 1 & 7.");
        }

        // Насны ангилал
        int age = 28;
        if (age >= 0 && age <= 12) {
            System.out.println("Хүүхэд");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Өсвөр нас");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Насанд хүрэгч");
        } else if (age >= 60) {
            System.out.println("Ахмад");
        } else {
            System.out.println("Буруу нас оруулсан байна.");
        }

        // Гурвалжны төрөл
        int a = 1;
        int b = 2;
        int c = 3;
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }

        // Хямдралын тооцоо.
        int totalPrice = 75000;
        if (totalPrice >= 100000) {
            System.out.println("10% хямдрал.");
        } else if (totalPrice <= 50000 && totalPrice < 100000) {
            System.out.println("5% хямдрал.");
        } else {
            System.out.println("Hямдралгүй.");
        }

        // Өндөр жил
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " он бол өндөр жил мөн.");
        } else {
            System.out.println(year + " он бол өндөр жил биш.");
        }

        // Ажлын өдөр эсвэл Амралтын өдөр
        String day = "TuesDay".toLowerCase();
        if (day == "monday" || day == "tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday") {
            System.out.println("ажлын өдөр");
        } else if (day == "Saturday" || day == "Sunday") {
            System.out.println("амралтын өдөр");
        } else {
            System.out.println(day + " гэдэг өдөр байхгүй.");
        }

        // Хоёр шаттай нэвтрэлт
        String name = "Batja";
        String password = "Secret";
        if(name == "Batja" && password == "Secret") {
            System.out.println("Нууц үг зөв байна.");
        } else {
            System.out.println("Нууц үг зөв байна.");
        }

        // Кино үзэх эрх
        int age1 = 16;
        boolean withParent = true;
        if(age1 >= 18 || withParent == true ) {
            System.out.println("Кино үзэх эрхтэй.");
        } else {
            System.out.println("Кино үзэх эрхгүй");
        }

        // Их сургуульд элсэх
        int testScore = 90;
        int interviewScore = 75;
        if(testScore > 85) {
            if(interviewScore > 70) {
                System.out.println("Тэнцлээ");
            } else {
                System.out.println("Ярилцлагад тэнцсэнгүй");
            }
        } else {
            System.out.println("Элсэлтийн шалгалтад тэнцсэнгүй");
        }

        // Сарын нэр
        int month = 7;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Novemer");
                break;
            case 12:
                System.out.println("December");
                break;
            
        }

        // Эгшиг эсвэл Гийгүүлэгч
        char letter = 'а';
        switch(letter) {
            case 'а':
            case 'э':
            case 'и':
            case 'о':
            case 'у':
            case 'ө':
            case 'ү':
                System.out.println(letter + " нь эгшиг үсэг байна.");
                break;
            default:
                System.out.println(letter + " нь гийгүүлэгч үсэг байна.");
        }

        // Энгийн тооны машин
        int digit1 = 12;
        int digit2 = 4;
        char operator = '*';
        int result;
        switch (operator){
            case '+':
                result = digit1 + digit2;
                System.out.println( "Plus: " + result );
                break;
            case '-':
                result = digit1 - digit2;
                System.out.println( "Minus: " + result );
                break;
            case '*':
                result = digit1 * digit2;
                System.out.println( "Multiply: " + result );
                break;
           case '/':
                result = digit1 / digit2;
                System.out.println("Divide: " + result);
                break;
        }

        // Улирал тодорхойлох
        int monthNum = 1;
        String season = "";
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        System.out.println("Улирал: " + season);
    }
}