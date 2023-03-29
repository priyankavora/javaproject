package practicalLoopStatement;

public class Flp {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {        //true condition//
            System.out.println(i);
        }
        for (int i = 1; i >= 5; ++i) {     //false condition//
            System.out.println(i);     // here is inside the {body}
        }
        int sum = 0;                   // when you declare variable outside of loop we have to sout outside the body{}//
        for (int m = 1; m <= 50; ++m) {
            sum = sum + m;
        }
        System.out.println(sum);
        for (int number = 1; number <= 50; number += 2) {
            System.out.println(number + " " +"is odd number");
        }

    }
}








