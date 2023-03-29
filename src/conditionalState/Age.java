package conditionalState;

public class Age {
    public static void main(String[] args) {
        int personAge = 20;
        if (personAge <= 5) {
            System.out.println("infant child");
        } else if (personAge >= 5 && personAge <= 12) {

            System.out.println("Age is 5 year to 10 year");
        } else if (personAge >= 13 && personAge <= 19) {
            System.out.println("person is teenager");
        } else {
            System.out.println("person is adult");
        }


    }

}









