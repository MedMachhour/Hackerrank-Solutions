import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int x=a[a.length-1];
        while(x<=b[0]){
            if(isFactor(a,x)&&isMultiple(b,x)){
                count++;
                x++;
            }else{
                x++;
            }

        }
        return count;
    }
    static boolean isFactor(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(x%a[i]==0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    static boolean isMultiple(int[] b,int x){
        for(int i=0;i<b.length;i++){
            if(b[i]%x==0){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
