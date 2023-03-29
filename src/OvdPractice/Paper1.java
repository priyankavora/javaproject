package OvdPractice;

public class Paper1 {
    static void foo() {
        System.out.println("Good morning sir!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + "sir!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a +" " + "sir!");
        System.out.println("Good morning " + b +" " + "sir!");
    }
    static void foo(int a,int b,int c){
        System.out.println("Good morning " + a +" "+ "sir!");
        System.out.println("Good morning " + b +" "+ "sir!");
        System.out.println("Good morning " + c +" "+ "sir!");
    }

    public static void main(String[] args) {
        foo();
        foo(12,34);
        foo(5,10,15);


    }
}
