/**
 * Created by simo on 02/11/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int[] result=new int[2];
        int n=s.length;
        int countH=0,countL=0;
        int tempH=s[0];
        int tempL=s[0];
        for(int i=1;i<n;i++){
            if(s[i]<=tempH){
                continue;
            }else{
                tempH=s[i];
                countH++;
            }

        }
        for(int i=1;i<n;i++){
            if(s[i]>=tempL){
                continue;
            }else{
                tempL=s[i];
                countL++;
            }

        }
        result[0]=countH;
        result[1]=countL;
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
