import java.util.*;

class Main {

    static void printArray(int[] array) {
        for (int value : array)//to display
            System.out.print(value + " ");
        System.out.println();
    }

    static void asc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void desc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(array);

        asc(array);
        System.out.println("Array in Ascending Order:");
        printArray(array);

        desc(array);
        System.out.println("Array in Descending Order:");
        printArray(array);

        sc.close();
    }
}
