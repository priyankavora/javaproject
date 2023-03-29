package conditionalState;

public class Else {
    public static void checkPersonalInfo(int age, int weight, Float hight) {

        if (age > 18)
            System.out.println("person is capable for horse riding");
            if(weight > 100)
                System.out.println("person is over weight and he is not allow");
                if(hight >=5)
                    System.out.println("person is capable for horse riding");
                 else
                    System.out.println("Do not allow");

        }



    public static void main(String[] args) {
        checkPersonalInfo(12, 556, 4.6f);

    }

}







