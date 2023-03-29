package methodPractice;

public class Calculator {

    public static int addition(int a,int b,int c){
        int d = a + b + c;
        return d;
    }
    public static String printFullName(String name, String lastName){
        String fullName = name + " " +lastName;
        return fullName;
    }
    public static int subtraction(int a,int b,int c){
        int d = a - b - c;
        return d;

    }
    public static int multiply(int a, int b, int c){
        int h = ( a * b * c);
        return h;
    }
    public int division(int a,int b){
        int c = a / b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(addition(10,20,30));
        System.out.println(printFullName("Priyanka","Bhanderi"));
        System.out.println(subtraction(40,30,10));
        System.out.println(multiply(76,64,67));
        Calculator Calculater = new Calculator(); /* Plz explain how did we create object here which
         condition you have use for creating an object not understand bz i hv try one you teach us which shows an error*/
        System.out.println(Calculater.division(23,12));
    }
}
