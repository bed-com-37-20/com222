public class Person {
   private String name;
   private String address;
   private String phonenumber;
   private String e_mailAdress;
   public Person(){
       this.name ="Enerst";
   };
   public void setName(){
       this.name ="Enerst";
   }
   public String getName(){
       return this.name;
   }
public String toString(){
    return "This is personal class with person name called " + getName();

}
}