import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean xorBQ(int[] ar){
        if((ar[0] ^ ar[1] ^ ar[2] ^ ar[3])!=0) return true;
        else return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test.in");
        Scanner sc = new Scanner(f);
        int[] ar = new int[4];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<4;i++){
            ar[i]=sc.nextInt();
        }
        for (int a=0;a<=ar[0];a++){


        }

    }
}
