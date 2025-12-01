public class Recapture {
    // 3 төрлийн мэдээлэл хадгалах
    // 1. нас
    // 2. нэр
    // 3. хүйс
    // Эдгээрийг ашиглан constructor бүтээж авдаг болгоно уу
    // Main.java дотор Recapture class-ийн төрөлтэй 2 object үүсгэнэ үү.

    // Дээр property-нуудаас хамааран
    // 1. getAge
    // 2. getName
    // 3. getGender гэсэн class method-уудыг үүсгэж шинээр үүсгэсэн
    // object-уудаасаа дуудаж хэвлэж харуулна уу.
    
    public int age;
    public String name;
    public String gender;

    public Recapture(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;

        int getAge() {
            return age;
        }

        String getName() {
            return name;
        }

        String getGender() {
            return gender;
        }
    }
}
