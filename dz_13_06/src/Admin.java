
//
public class Admin extends Worker{
    Admin(String name, String lastName){
        super(name,lastName,"Admin");
    }
    @Override
    public void goToWork(){
        super.goToWork();
        System.out.println("Настраивает компьютеры");
    }
    @Override
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("Отдых 3");
    }
}