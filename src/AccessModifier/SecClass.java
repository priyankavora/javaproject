package AccessModifier;

public class SecClass {

     protected String myFavSportName = "Football";



    public static void main(String[] args) {
        SecClass mySportObject = new SecClass();
        System.out.println(mySportObject.myFavSportName);
        FirstClass myFirstObject = new FirstClass();
        System.out.println(myFirstObject.a);
        System.out.println(myFirstObject.c);
        System.out.println(myFirstObject.d);

    }

}
