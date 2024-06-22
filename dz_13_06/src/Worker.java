

public class Worker{
    private final String name; // ���
    private final String lastName; // �������
    private final String profession; // ���������
    Worker(String name, String lastName, String profession){
        this.name=name;
        this.lastName=lastName;
        this.profession=profession;
    }
    public String toString(){
        return String.format("<worker: %s %s, %s>",getLastName(),getName(),getProfession());
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

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfession() {
        return profession;
    }
}