

public class Worker{
    private String name; // имя
    private String lastName; // фамилия
    private String profession; // профессия
    Worker(String name, String lastName, String profession){
        this.name=name;
        this.lastName=lastName;
        this.profession=profession;
    }
    public void goToWork(){
        System.out.println(String.format("Имя работника: %s %s",name,lastName));
        System.out.println(String.format("Профессия: %s",profession));
    }
    public void goToVacation(int days){
        System.out.println(String.format("Имя работника, уходящего в отпуск: %s %s",name,lastName));
        System.out.println(String.format("Профессия: %s",profession));
        System.out.println(String.format("Количество дней отпуска: %d",days));
    }
}