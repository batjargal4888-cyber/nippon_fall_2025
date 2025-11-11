public class MatrixMaxFinder {
    // 2D massive дахь хамгийн их тоог олох function
    public static int findMaxInMatrix (int[][] matrix) {
        int max = matrix[0][0]; // Эхний element-ээр эхлэнэ
        // Давхар давталт ашиглана
        for (int i = 0; i < matrix.length; i++) {           // мөрөөр давтах
            for (int j = 0; j < matrix[i].length; j++) {    // тухайн мөрийн баганаар давтах
                if (matrix[i][j] > max) {
                    max = matrix[i][j]; // илүү том тоо олдвол хадгална
                }
            }
        }
        return max;
    }
}
