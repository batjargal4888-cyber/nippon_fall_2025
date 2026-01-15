// Sorting Algorithm
public class SortingAlgo01 {
    private int[] arrays;

    public SortingAlgo01(int[] arrays) {
        this.arrays = arrays;
    }

    public void sortArray() {
        // Enehuuu method aashiglan bid nar
        // arrays dotor baigaa duriin bairshlaar orson toonuudiig
        // usuh daraallaar oruuldag bolgono uu
        // input => [10, 5, 6, 55, 45, 1]
        // output => [1, 5, 6, 10, 45, 55]

        // MAX-iig n baruun tald tawih arga (Selection sort - max)
        for (int end = arrays.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int i = 1; i <= end; i++) {
                if (arrays[i] > arrays[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arrays[maxIndex];
            arrays[maxIndex] = arrays[end];
            arrays[end] = temp;
        }
        printArray();
    }

    private void printArray() {
        System.out.print("[");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
            if (i < arrays.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
