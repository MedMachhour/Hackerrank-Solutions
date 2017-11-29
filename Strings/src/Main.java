import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static String super_reduced_string(String s){
        Stack<Character> result= new Stack<Character>();
        char c;
        for (int i = 0; i <s.length() ; i++) {
            c=s.charAt(i);
            if(!result.isEmpty()&& result.peek()==c){
                result.pop();
            }else{
                result.push(c);
            }
        }
        String resulta="";
        if(result.empty()){
            return "Empty String";
        }
        for (int i = 0; i <result.size() ; i++) {
            resulta+=result.get(i);
        }
        return resulta;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
