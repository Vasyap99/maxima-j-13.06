

public class Devops extends Worker{
    Devops(String name, String lastName){
        super(name,lastName,"DevOps");
    }
    public void goToWork(){
        super.goToWork();
        System.out.println("...");
    }
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("־עהûץ 4");
    }
}