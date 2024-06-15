

public class Programmer extends Worker{
    Programmer(String name, String lastName){
        super(name,lastName,"Programmer");
    }
    public void goToWork(){
        super.goToWork();
        System.out.println("Writing a program");
    }
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("־עהûץ 1");
    }
}