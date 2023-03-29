package abs;

public abstract class SamsungGalaxy {
    public static void ringtone(){

    }
    public static void touchdisplay(){
        System.out.println("Samsung Galaxy Features.");
        System.out.println("Display : 6.5 inch of Display");

    }
    public static void voicecall(){
        System.out.println("Voicecall :you can make a voice call");

    }
    public static void camera(){
        System.out.println("Camera : 13 mega pixel of camera");

    }
    abstract void downloadApp();

    public static void main(String[] args) {
        touchdisplay();
        voicecall();
        camera();
    }

}
