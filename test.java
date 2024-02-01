import java.lang.reflect.Array;
import java.util.Scanner;

public class test {
    public static int main(String[] args) {
        System.out.println("hello--naveen--");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println(n);
        //orderOf(arr[n]);
    

    int orderOf(int arr[n]){
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] * (arr.length - i);
            ans = ans + temp;
        }
        return ans;
    }
}
}
