public class Point {
    // private access
    // P.A n zuwhun class dotroo haragddag 
    // ashiglagdaj boloh property-nuudiig heldeg
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    // API
    // class dotroos medeelliig gadagsh n zuwhun heregtei uyd n
    // ugdug zuiliig helne
    public double getX(){
        return x;
    }
    // x-iin utgiig uurchildug public setX gedeg function todorhoilood
    // testleh dee shineer uusgesen object-iinhoo x uurchlugduj baigaag
    // ajiglaj batlana uu
    public void setX(double x) {
        this.x = x;
    }
}
