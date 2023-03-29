public class StringPractice {
    public static void main(String[] args) {
        String cricketer = "Kapil dave is a best bowler";
        System.out.println(cricketer.length());
        System.out.println(cricketer.isEmpty());
        System.out.println(cricketer.replace("Kapil dave","M s Dhoni"));
        System.out.println(cricketer.toLowerCase());
        System.out.println(cricketer.contains("best"));
        System.out.println(cricketer.contains("very"));
        System.out.println(cricketer.concat(" and was a star!"));
        System.out.println(cricketer.contentEquals("M s Dhoni"));
        System.out.println(cricketer.indexOf("is"));
        StringBuffer StringBuffer = new StringBuffer(cricketer);
        System.out.println(StringBuffer.reverse());


        // I wasn't able to find reverse in library//
    }
}
// static void foo(){
//            System.out.println("Good morning sir");
//        }
//        static void change(int a){
//            System.out.println("Good morning " + a + "sir!");//