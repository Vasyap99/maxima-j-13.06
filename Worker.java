

public class Worker{
    private String name; // ���
    private String lastName; // �������
    private String profession; // ���������
    Worker(String name, String lastName, String profession){
        this.name=name;
        this.lastName=lastName;
        this.profession=profession;
    }
    public void goToWork(){
        System.out.println(String.format("��� ���������: %s %s",name,lastName));
        System.out.println(String.format("���������: %s",profession));
    }
    public void goToVacation(int days){
        System.out.println(String.format("��� ���������, ��������� � ������: %s %s",name,lastName));
        System.out.println(String.format("���������: %s",profession));
        System.out.println(String.format("���������� ���� �������: %d",days));
    }
}