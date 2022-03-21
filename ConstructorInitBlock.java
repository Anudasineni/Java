class Students{
    {
        System.out.println("init block");//it will print  before constructor calls.
    }
    String name;
    int age;
    Students(){
        this("anusha",22);

        System.out.println("Inside no argument constructor of Students class");
    }
    Students(String name){
        System.out.println("Inside one argument constructor of Students class");
    }
    Students(String name,int age){
        this("anusha");

        System.out.println("Inside two argument constructor of Students class");
    }
}
class ECEstudent extends Students{
    ECEstudent(){

        System.out.println("Inside no argument constructor of ECEstudent");
    }
    ECEstudent(String name){
       //super(name);//it will call one argument constructor of student class.
        System.out.println("Inside one argument constructor of ECEstudent");
    }
    ECEstudent(String name,int age){
        super(name, age);
        System.out.println("Inside two argument constructor of ECEstudent");
    }
}
public class ConstructorInitBlock {
    public static void main(String args[]){
        //ECEstudent e = new ECEstudent(23,2020);
        ECEstudent e1=new ECEstudent("anu",22);

    }
}
