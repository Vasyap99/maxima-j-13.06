

public class Work{
    private Worker[]workers;
    public Work(Worker ... ws){
        workers=new Worker[ws.length];
        System.arraycopy(ws,0,workers,0,ws.length);
    }
    public void showWork(){
        for(int i=0;i<workers.length;i++){
            System.out.println("**********************");
            workers[i].goToWork();
        }
    }
    public void showVacations(){
        /*for(int i=0;i<workers.length;i++){
            workers[i].goToVacation(12);
        }*/
        for(var worker:workers){
            System.out.println("**********************");
            worker.goToVacation(12);
        }
    }

}