package practiceException;

public class Eth1 {
    public static void main(String args[]) {
        try {
            int num1 = 79, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }
        {
            try {
                String str = "The lord of the Ring book";
                System.out.println(str.length());
                char c = str.charAt(40);
                System.out.println(c);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException.");
            }
            {
                try {
                    String str = null;
                    System.out.println(str.length());
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException..");
                }
            }
        }
    }
}





