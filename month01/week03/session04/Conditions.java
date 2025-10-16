class Conditions {
    public static void main(String[] args){
        String color = "Red";
        // Хэрвээ color-ын утга red байвал улаан гэж хэвлэнэ үү
        if(color == "Red"){
            System.out.println("Улаан");
        }

        // шинээр 2 integer тоон утга оноосон хувьсагчид зарлаад
        // энэ 2 утганы их багыг нь шалгана уу.
        int a = 6;
        int b = 7;
        if (a > b){
            System.out.println("Bigger number is: " + a);
        } else {
            System.out.println("Bigger number is: " + b);
        }
    }
}