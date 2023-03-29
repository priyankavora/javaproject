package AccessModifier;

public class ThirdClass {
    public static int b = 5;
    public static int c =78;
    public static  int d = b + c;

    public static void main(String[] args) {
        FirstClass myFirstObject = new FirstClass();
        System.out.println(myFirstObject.c);
        System.out.println(myFirstObject.a);
        System.out.println(myFirstObject.d);
        System.out.println(FirstClass.x);
        System.out.println(myFirstObject.myName);
        myFirstObject.myFavBook();//non static method in sub class//
        SecClass mySportObject = new SecClass();
        System.out.println(mySportObject.myFavSportName);


    }
}
