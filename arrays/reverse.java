package arrays;

public class reverse {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 7, 8, 9, 6 };
        int sp = 0;
        int ep = 6;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        // System.out.println(arr);
        printArray(arr, 6);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i <= size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
