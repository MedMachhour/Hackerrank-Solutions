import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for(int a = 0; a < n; a++){
            arr[a] = input.nextInt();
        }

        long sum = 0;
        for(int a = 0; a < n; a++){
            sum += arr[a];
        }
        sum -= arr[k];
        sum = sum/2;
        long val = input.nextInt();

        if(sum == val){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(val-sum);
        }
    }
}
