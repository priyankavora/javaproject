package AccessModifier;

public class ForthClass {
    public static void main(String[] args) {
        FirstClass myFirstObject = new FirstClass();
        System.out.println(myFirstObject.c);
        System.out.println(myFirstObject.d);
        System.out.println(FirstClass.myName);
        myFirstObject.myNonStaticMethode();
        FirstClass.mymethode();


    }
}
