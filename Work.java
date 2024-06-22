

public class Work{
    private Worker[]workers;
    public Work(Worker ... ws){
        workers=new Worker[];
        System.arraycopy(ws,0,dest,0,ws.length);
    }
    public showWork(){
        for(int i=0;i<workers.length;i++){
            workers[i].goToWork();
        }
    }
    public showVacations(){
        for(int i=0;i<workers.length;i++){
            workers[i].goToVacation(12);
        }
    }
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