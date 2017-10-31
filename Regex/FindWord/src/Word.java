import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Word{
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Word.in");
        Scanner sc = new Scanner(f);
        int N = sc.nextInt();
        sc.nextLine();
        String sentences = readlines(sc, N);
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            String word = sc.next();
            Pattern p = Pattern.compile("(^|(?<=\\W))" + word + "(?=\\W)");
            Matcher m = p.matcher(sentences);
            int count = 0;
            while (m.find()) {
                count++;
            }
            System.out.println(count);

        }
        sc.close();

    }
    private static String readlines(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }
}