public class BubbleSort {

    // -----------------------------
    // 1️⃣ Энгийн Bubble Sort
    // -----------------------------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swapCount++;
            }
        }
        System.out.println("Normal Bubble Sort");
        System.out.println("Swap count: " + swapCount);
    }

    // -----------------------------
    // 2️⃣ Optimized Bubble Sort
    // -----------------------------
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;

        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            // хэрвээ swap хийгдээгүй бол array аль хэдийн sorted
            if (!swapped) {
                break;
            }
        }
        System.out.println("Optimized Bubble Sort");
        System.out.println("Swap count: " + swapCount);
    }

    // -----------------------------
    // Print array
    // -----------------------------
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // -----------------------------
    // Main
    // -----------------------------
    public static void main(String[] args) {

        int[] arrays = { 5, 2, 8, 1, 9 };
        System.out.print("Original array: ");
        printArray(arrays);

        // -----------------------------
        // Normal bubble sort
        // -----------------------------
        bubbleSort(arrays);
        System.out.print("Normal bubble sort: ");
        printArray(arrays); // {1, 2, 5, 8, 9}

        // -----------------------------
        // Array-г ДАХИН ШИНЭЭР ҮҮСГЭНЭ
        // -----------------------------
        arrays = new int[arrays.length];
        arrays[0] = 5;
        arrays[1] = 2;
        arrays[2] = 8;
        arrays[3] = 1;
        arrays[4] = 9;
        printArray(arrays);

        // -----------------------------
        // Optimized bubble sort
        // -----------------------------
        bubbleSortOptimized(arrays);
        System.out.print("Optimized bubble sort: ");
        printArray(arrays);

    }
}
