

public class Work{
    public static void main(String[]s){
        Worker[]workers = {
			new Programmer("����","������"),new Tester("����","������"),
			new Admin("�����","������"),new Devops("������","������")
        };
        for(int i=0;i<workers.length;i++){
            workers[i].goToWork();
            workers[i].goToVacation(12);
        }
    }
}