

public class Worker extends Human{
    private final String profession; // ���������
    Worker(String name, String lastName, String profession){
        super(name,lastName);
        this.profession=profession;
    }
    public String toString(){
        return String.format("<worker: %s %s, %s>",getLastName(),getName(),getProfession());
    }
    public void goToWork(){
        System.out.println(String.format("Имя работника: %s %s",getName(),getLastName()));
        System.out.println(String.format("Профессия: %s",profession));
    }
    public void goToVacation(int days){
        System.out.println(String.format("Имя работника, уходящего в отпуск: %s %s",getName(),getLastName()));
        System.out.println(String.format("Профессия: %s",profession));
        System.out.println(String.format("Количество дней отпуска: %d",days));
    }

    public String getProfession() {
        return profession;
    }
}