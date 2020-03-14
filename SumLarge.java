import java.util.Scanner;

public class SumLarge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = input.nextInt();
        long sum =0;
        long[] arr = new long[n];
        for (int i=0; i < n; i++){
            arr[i] = input.nextLong();
            sum = sum + arr[i];
        }
        System.out.print(sum);

        input.close();
        
    }
}