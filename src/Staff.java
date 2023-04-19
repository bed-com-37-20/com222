public  class Staff extends Employee {
String title;

public Staff(){
    this.title="Mr";

}
public String toString(){
        return "This Staff class for "+ title+ " "+ getName();
    }
}