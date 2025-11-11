public class JavaTernaryOperator {
    public static void main(String[] args) {
        
        // problem
         int a = 6;
        // a too 7 oos ih baiwal 7 oos ih
        if (a > 7) {
            System.out.println("7 oos ih");
        } else {
            System.out.println("7 oos baga");
        }

        // if a iin utga 10 aas baga bol 10 aar nemegduuleed utgiig hewleh
        // if a iin utga 10 aas ih bol 10 aar urjuuleed utgiig hewleh

        if (a > 10) {
            a = a * 10;
            System.out.println(a);
        } else {
            a = a + 10;
            System.out.println(a);
        }

        // ternary operator

        a = a > 10 ? a * 10 : a + 10;
        System.out.println(a);

        // Exercise: age гэдэг хувьсагч зарлаад түүнд өөрийнхөө насыг онооно уу
        // String төрөлтэй ageType гэдэг хувьсагч зарлаад
        // ternary operator ашиглан хэрвээ чиний нас 0-оос 13 хооронд байвал "baby",
        // 13-аас 19-ийн хооронд байвал "teenager", 
        // бусад үед нь "adult" гэдэг хадгалдаг болгоно уу
        // Үр дүнгээ хэвлээрэй.

        int age = 28;
        String ageType = "";
        ageType = age > 0 && age <= 13 ? "baby"
                : age > 13 && age <= 19 ? "teenager"  
                : "adult";
        System.out.println(ageType);
    }
}
