import java.util.Scanner;

/**
 * Created by simo on 03/11/2017.
 */
public class Solution {
    static String solve(int year){
        int day = 256;
        int month = 1;
        while (true) {
            int daysInMonth = DaysInMonth(year, month);

            if (day <= daysInMonth) {
                break;
            }

            day -= daysInMonth;
            month++;
        }
        return String.format("%02d.%02d.%d", day, month, year);
    }
    static int DaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (year == 1918) {
            return 15;
        } else if (isLeap(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    static boolean isLeap(int year){
        if(year>=1700 && year<=1917){
            if (year%4==0){
               return true;
            }else
                return false;
        }
        if (year>=1919 && year<=2700){
            if (year%400==0 || (year%4==0 && year%100!=0)){
                return true;
            }else
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
