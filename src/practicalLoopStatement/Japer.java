package practicalLoopStatement;

public class Japer {
    public static void timeTables(int tableNo) {

        System.out.println("Time tables");
        System.out.println("----------------------");

        for (int m = 10; m >= 1; m--) {
            System.out.println(tableNo + "X" + m + "=" + tableNo * m);
        }
    }

    public static void main(String[] args) {
        timeTables(6);
        timeTables(8);
    }
}
