package practicalLoopStatement;

public class Tables {
    public static void timeTables(int tableNo){

        System.out.println("Time tables");
        System.out.println("----------------------");

        for(int m = 1; m <= 10; m++){

            System.out.println(tableNo + "X" +m + "=" + tableNo * m);
        }

    }
    public static void main(String[] args) {
        timeTables(12);
        timeTables(13);
    }

}

