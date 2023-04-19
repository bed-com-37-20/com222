import java.util.Date;

public class Employee extends Person {
    String officeName;
    private double salary;
    private java.util.Date date;

    public Employee(){

        //date1.toString();
        //System.out.println(toString1() +"   ");

        //System.out.println("last to excute");
    }

    public String toString(){
        return "This is Employee class with Employee called " + getName() + " created at " + new Date();
    }

}
