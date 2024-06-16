

public class Admin extends Worker{
    Admin(String name, String lastName){
        super(name,lastName,"Admin");
    }
    public void goToWork(){
        super.goToWork();
        System.out.println("����������� ����������");
    }
    public void goToVacation(int days){
        super.goToVacation(days);
        System.out.println("����� 3");
    }
}