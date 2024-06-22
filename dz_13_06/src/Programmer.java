

public class Programmer extends Worker{
    Programmer(String name, String lastName){
        super(name,lastName,"Programmer");
    }
    @Override
    public void goToWork(){
        super.goToWork();
        System.out.println("Writing a program");
    }
    @Override
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("Отдых 1");
    }
}