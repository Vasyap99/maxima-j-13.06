public class Main {
    public static void main(String[]s){
        /*
        Worker[]workers = {
                new Programmer("����","������"),new Tester("����","������"),
                new Admin("�����","������"),new Devops("������","������")
        };
        for(int i=0;i<workers.length;i++){
            workers[i].goToWork();
            workers[i].goToVacation(12);
        }*/
        Work w=new Work(new Programmer("Вася","Пупкин"),new Tester("Иван","Пупкин"),
                new Admin("Сергей","Сергеев"),new Devops("Петр","Иванов"));
        w.showWork();
        w.showVacations();
    }
}
