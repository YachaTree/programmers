import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] todayInput = br.readLine().split(" ");
        String[] dDayInput = br.readLine().split(" ");
        
        int todayYear = Integer.parseInt(todayInput[0]);
        int todayMonth = Integer.parseInt(todayInput[1]);
        int todayDay = Integer.parseInt(todayInput[2]);
        
        int dDayYear = Integer.parseInt(dDayInput[0]);
        int dDayMonth = Integer.parseInt(dDayInput[1]);
        int dDayDay = Integer.parseInt(dDayInput[2]);
        
        if (dDayYear - todayYear > 1000 || (dDayYear - todayYear == 1000 && (dDayMonth > todayMonth || (dDayMonth == todayMonth && dDayDay >= todayDay)))) {
            System.out.println("gg");
        } else {
            int daysDifference = calculateTotalDays(dDayYear, dDayMonth, dDayDay) - calculateTotalDays(todayYear, todayMonth, todayDay);
            System.out.println("D-" + daysDifference);
        }
    }
    
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
    
    private static int calculateTotalDays(int year, int month, int day) {
        int totalDays = 0;

        for (int i = 1; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // 윤년인 경우 2월은 29일
        }

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // 해당 월의 일수 추가
        totalDays += day;

        return totalDays;
    }
}
