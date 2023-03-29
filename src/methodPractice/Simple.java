package methodPractice;

import java.awt.*;

public class Simple {
    public static int sum(){
        int m = 67;
        int n = 55;
        int t = m + n;
        return t;
    }
    public String myPhoneDetail(){
        String name = "red me note 13";
        String size = "6.36inches";
        String colour = "White";
        return (name+" "+size+" "+colour);
    }
    public static void main(String[] args) {
        System.out.println(sum());
        Simple Simple = new Simple();
        System.out.println(Simple.myPhoneDetail());
    }
}
