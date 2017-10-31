import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by simo on 30/10/2017.
 */
public class Email {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Email.in");
        Scanner sc = new Scanner(f);
        ArrayList<String> list = new ArrayList<String>();
        int n = sc.nextInt();
        StringJoiner joiner = new StringJoiner(";");
        while(n-->=0)
        {
            String word = sc.nextLine();
            if(!word.equals(""))
            {
                String emailPattern ="(\\b[a-zA-Z_.]+@[a-z.]*[a-z]{1,3}\\b)";
                Pattern pattern = Pattern.compile(emailPattern);
                Matcher m = pattern.matcher(word);
                while(m.find())
                {
                    String emailAddress = m.group(1);
                    if(!list.contains(emailAddress))
                        list.add(emailAddress);
                }

            }
        }
        String result="";
        Collections.sort(list);
        for(int j=0;j<list.size();j++){
            joiner.add(list.get(j));
        }
        System.out.println(joiner.toString());



    }
}
