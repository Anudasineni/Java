public class EncapsulationExample {
    public static void main(String args[]){
       // System.out.println(name);cant access private variables to another class.using get set methods we can use.
        //encapsulation =>data hiding
        Student s=new Student();
       String n= s.getName();
       System.out.println(n);
       s.setAge(12);
       System.out.println( s.getAge());
    }
}
class Student{
   private String name="anusha";
   private int age;
   public void setName(String newname){

       name=newname;
   }
   public String getName(){
       return name;
   }
   public void setAge(int newage){
       age=newage;
   }
   public int getAge(){
       return age;
   }
}