package conditionalState;

public class Issu {
    public static void checkPersonalInfo(int age, int weight, Float hight) {

        if (age > 18)
            if (weight < 88)
                if (hight >= 5)
                    System.out.println("person should be max 5fit in hight");
                else
                    System.out.println("person is capable for horse riding");
            else
                System.out.println("person is over weight");
        else
            System.out.println("Do not Enter the race");
    }


    public static void main(String[] args) {
        checkPersonalInfo(25, 12, 4.6f);

    }
}
