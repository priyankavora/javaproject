package practicalLoopStatement;

public class Dwl {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 40);// print the number up to 40//

        String name = "priyanka";
        do {
            System.out.println(name);
            break;
        }while(name =="priyanka");
        int m = 0; int n = 4;
        do{
            System.out.println(m);
            m++;
        }while(m <= n);
    }
}
