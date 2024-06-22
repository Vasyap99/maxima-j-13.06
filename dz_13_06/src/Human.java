public class Human extends Monkey{
    private final String name;
    private final String lastName;
    public Human(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

}
