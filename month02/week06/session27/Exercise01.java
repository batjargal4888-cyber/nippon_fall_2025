class Exercise01 {
    
    static boolean isPositive(int too){
        if (too > 0) {
            return true;            
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("is 10 positive: " + isPositive(10));
        System.out.println("is -5 negative: " + isPositive(-5));
    }

}
