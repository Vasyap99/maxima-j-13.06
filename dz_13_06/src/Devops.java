

public class Devops extends Worker{
    Devops(String name, String lastName){
        super(name,lastName,"DevOps");
    }
    @Override
    public void goToWork(){
        super.goToWork();
        System.out.println("...");
    }
    @Override
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("Отдых 4");
    }
}