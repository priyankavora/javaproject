package intterface;

public class EastburyFarmSchool implements SchoolDetail{
    @Override
    public void schoolName() {
        System.out.println("School Name:EastburyFarm Primary School");
    }
    @Override
    public void SchoolAddress() {
        System.out.println("Address: Bishops Ave, Northwood HA6 3DG");
    }
    @Override
    public void MaximumClass() {
        System.out.println("Class: Nursary to year 6");
    }
    @Override
    public void UniformColour() {
        System.out.println("UniformColour: Gray and Green");
    }
    @Override
    public void SchoolOfsted() {
        System.out.println("Ofsted : Good School With Outstanding Features");
    }
    public static void main(String[] args) {
        EastburyFarmSchool EastburyFarmSchool = new EastburyFarmSchool();
        EastburyFarmSchool.schoolName();
        EastburyFarmSchool.SchoolAddress();
        EastburyFarmSchool.MaximumClass();
        EastburyFarmSchool.UniformColour();
        EastburyFarmSchool.SchoolOfsted();
    }
}
