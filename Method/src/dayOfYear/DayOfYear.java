package dayOfYear;

public class DayOfYear {
    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    //year divisible by 4, divisible by 100, divisible by 400 is a leap year
                    return 366;
                } else {
                    //year divisible by 4, divisible by 100, not divisible by 400 is not a leap year
                    return 365;
                }
            } else {
                //year divisible by 4 is leap year
                return 366;
            }
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        int year = 2020;
        System.out.println("Year " + year + " has " + numberOfDaysInAYear(year) + " days");
    }

}
