package ovr;

public class NissanQashqai extends NissanMicra {
    public void bodyStyle(){
        System.out.println("Nissan Qashqai is a Compact cross over 5-door SUV");
        super.bodyStyle();

    }
    public static void main(String[] args) {
        NissanQashqai NissanQashqai = new NissanQashqai();
        NissanQashqai.bodyStyle();



    }
}
