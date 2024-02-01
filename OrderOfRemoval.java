class OrderOfRemoval {
    public static void main(String[] args) {
        // int n;
        System.out.println("hello this is a simple program for sorting--");
        // orderOf(int arr[7]);
        int arr[] = { 4, 5, 5, 6, 7, 8, 2, 4, 3, 4 };
        // Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] * (arr.length - i);
            ans = ans + temp;
        }
        System.out.println(ans);
    }

}