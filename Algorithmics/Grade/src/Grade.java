import java.util.Scanner;

/**
 * Created by simo on 01/11/2017.
 */
public class Grade {
    static int[] solve(int[] grades){
        int test;
        int grade;
        for(int i=0;i<grades.length;i++){
            grade=grades[i];
            test=5-grade%5;
            if(test<3){
                grade+=test;
                if(grade>=40){
                    grades[i]=grade;
                }
            }
        }
        return grades;

}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] gradest = solve(grades);
        for (int i = 0; i < gradest.length; i++) {
            System.out.print(gradest[i] + (i != gradest.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
