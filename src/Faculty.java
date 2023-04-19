import java.util.Timer;

public class Faculty  extends  Employee{
    private java.util.Timer time;
    String rank;

    public Faculty() {
        this.rank= "Head of department";
    }
    public String toString(){
        return "This Faculty class working time " + "for Mr " + getName();
    }
}
