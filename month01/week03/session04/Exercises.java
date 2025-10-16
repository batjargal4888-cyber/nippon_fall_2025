class Exercises {
    public static void main(String[] args) {
        // Exercise 01
        // Нэвтрэлт шалгах: boolean isLoggedIn = false;
        // гэсэн хувьсагч өгөгдөв. Хэрэглэгч нэвтэрсэн бол
        // "Тавтай морил!", үгүй бол "Нэвтэрнэ үү." гэж хэвлэнэ.

        boolean isLoggedIn = false;
        if (isLoggedIn == true) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Login!");
        }

        /**
         * Exercise 01
         * Тэнцсэн дүн: int score = 75; гэсэн шалгалтын оноо өгөгдөв.
         * Оноо 60 ба түүнээс дээш бол "Тэнцсэн",
         * үгүй бол "Тэнцээгүй" гэж хэвлэ.
         */

        int score = 75;
        if (score >= 60) {
            System.out.println("Pass.");
        } else {
            System.out.println("Fail.");
        }

        // EX3
        int n = -5;
        if (n > 0) {
            System.out.println("Эерэг");
        } else if (n < 0) {
            System.out.println("Сөрөг");
        } else {
            System.out.println("Teg");
        }

        // EX4
        int a = 3;
        if (a % 2 == 0) {
            System.out.println("Тэгш");
        } else {
            System.out.println("Сондгой");
        }

        // EX5
        int age = 20;
        if (age >= 18) {
            System.out.println("Vote");
        } else {
            System.out.println("Can't vote");
        }

        // EX6
        int scoreTest = 67;
        if (scoreTest >= 90 && scoreTest <= 100) {
            System.out.println("A");
        } else if (scoreTest < 90 && scoreTest >= 80) {
            System.out.println("B");
        } else if (scoreTest < 80 && scoreTest >= 70) {
            System.out.println("C");
        } else if (scoreTest < 70 && scoreTest >= 60) {
            System.out.println("D");
        } else if (scoreTest < 60 && scoreTest >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Give number between 0 & 100.");
        }
    }
}
