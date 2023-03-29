package AccessModifier;
public class FirstClass {
    public int a = 2;
    private int b = 5;
    protected int c = 6;
    int d =4;
    public static int x = 13;
    static int p = 67;
    static int q = 78;
    private static int y = p + q;
    protected static String myName = "Priyanka";
    public static void mymethode(){
        System.out.println("Modifier name : public,private,protected,Default");
    }
    public void myNonStaticMethode(){
        System.out.println("NonAccessModifier: Static,Final,Abstract,synchronized and volatile");
    }
    public void myFavBook(){
        System.out.println("Merlin");
    }
    public static void myFavMovie(){
        System.out.println("Epic");
    }
    public static void main(String[] args) {
        FirstClass myFirstObject = new FirstClass();
        myFirstObject.myNonStaticMethode();
        myFirstObject.myFavBook();// non static methode//
        System.out.println(p);
        myFavMovie();
        mymethode();//static methode//
        System.out.println(myFirstObject.a);
        System.out.println(myFirstObject.b);   //can be access to this First class only //
        System.out.println(myFirstObject.c);  //Can be access to Access modifier package and sub class//
        System.out.println(myFirstObject.d);
        System.out.println(FirstClass.x);
        System.out.println(FirstClass.y);
        System.out.println(FirstClass.myName);//Can be access to Access modifier package and sub class//
    }
}
