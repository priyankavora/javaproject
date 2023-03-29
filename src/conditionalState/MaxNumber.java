package conditionalState;

public class MaxNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 30;
        int c = 10;
        if (a>b && a>c) {
            System.out.println(a + "is greater number");
        }
            else if (b>a && b>c) {
            System.out.println(b +" "+"is greater number");
        }
            else{
            System.out.println(c+"is grater number");
        }
    }
}
