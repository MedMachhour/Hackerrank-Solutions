import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    static int migratoryBirds(int n, int[] ar) {
        Arrays.sort(ar);
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        for(int key:ar){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        int value=0;
        int k=ar[0];
        for(int key:map.keySet()){
            if(map.get(key)>value ){
                value=map.get(key);
                k=key;
            }else{
                continue;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
