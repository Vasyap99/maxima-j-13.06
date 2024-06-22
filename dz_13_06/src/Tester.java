

public class Tester extends Worker{
    Tester(String name, String lastName){
        super(name,lastName,"Tester");
    }
    public void goToWork(){
        super.goToWork();
        System.out.println("Testing a program");
    }
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("Отдых 2");
    }
}