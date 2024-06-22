

public class Tester extends Worker{
    public Tester(String name, String lastName){
        super(name,lastName,"Tester");
    }
    @Override
    public void goToWork(){
        super.goToWork();
        System.out.println("Testing a program");
    }
    @Override
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("Отдых 2");
    }
}