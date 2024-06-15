

public class Work{
    public static void main(String[]s){
        Worker[]workers = {
			new Programmer("Вася","Пупкин"),new Tester("Ваня","Иванов"),
			new Admin("Антон","Пупкин"),new Devops("Сергей","Петров")
        };
        for(int i=0;i<workers.length;i++){
            workers[i].goToWork();
            workers[i].goToVacation(12);
        }
    }
}