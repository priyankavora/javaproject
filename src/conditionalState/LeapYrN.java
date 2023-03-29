package conditionalState;

public class LeapYrN {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0)
            if (year % 100 != 0)
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year");
        else
                    System.out.println(year + "not a leap year");
        else
                System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");


    }

    public static void main(String[] args) {
        checkLeapYear(2000);
        checkLeapYear(1987);
        checkLeapYear(2008);
        checkLeapYear(1466);
        checkLeapYear(2004);

    }
}



