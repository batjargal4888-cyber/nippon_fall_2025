class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println(counter);

        System.out.println("While Loop Start");
        while(counter <= 10){
            System.out.println(counter);
            counter = counter + 1;
        }
        System.out.println("While Loop End");

        // Exercise 01
        // 20 хүртэл зөвхөн тэгш тоонуудыг хэвлэх java code бичнэ үү
        // while loop ашиглаарай.
        
        int counter1 = 0;
        System.out.println("Even Numbers: ");
        while(counter1 <= 20){
            if(counter1 % 2 == 0){
                System.out.println(counter1);
            }
            counter1 = counter1 + 1;
        }
        System.out.println("While Loop End");

        // Exercise 02
        // While loop ашиглан 50 хүртэлх тооны зөвхөн сондгой тоонуудыг
        // цувуулан харуулах java code бичнэ үү.

        int counter2 = 0;
        System.out.println("Exercise 02 While Loop Start");
        while(counter2 <= 50){
            if(counter2 % 2 != 0){
                System.out.println(counter2);
            }
            counter2 = counter2 + 1;
        }
        System.out.println("Exercise 02 While Loop End");

        // Exercise 03
        // 1-ээс 100 хүртэлх тооны нийлбэрийг нь олоод хэвлэдэг
        // java code бичнэ үү.
        
        int counter3 = 1;
        int summe = 0;
        System.out.println("Exercise 03 While Loop start");
        while(counter3 <= 100){
            summe = summe + counter3;
            counter3 = counter3 + 1;
        }
        System.out.println("The sum of 1 - 100: " + summe);
    }
}