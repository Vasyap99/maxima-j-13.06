public class Main {
    public static void main(String[]s){
        Work w=new Work(new Programmer("Вася","Пупкин"),new Tester("Иван","Пупкин"),
                new Admin("Сергей","Сергеев"),new Devops("Петр","Иванов"));
        w.showWork();
        w.showVacations();
    }
}
