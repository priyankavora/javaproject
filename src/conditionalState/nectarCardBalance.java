package conditionalState;

public class nectarCardBalance {

    public static final int MINIMUM_BALANCE = 100;


    public static void checkNectarCardBalance(int Balance){
        if (Balance >= MINIMUM_BALANCE) {
            System.out.println("use Card Balance");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        checkNectarCardBalance(500);
      // I have nearly same program but here my syntax is different//
    }

    }


