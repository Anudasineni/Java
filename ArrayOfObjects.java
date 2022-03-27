class Employees{
String name;
int age;
    public Employees(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public  void say(){
        System.out.println("name:"+this.name +" ,"+"age:"+this.age);
    }
}
public class ArrayOfObjects{
    public static  void main(String args[]){
        Employees m1=new Employees("anu",22);//creating Employees object
        Employees m2=new Employees("anusha",23);
        Employees m3=new Employees("shashi",20);
        Employees m4=new Employees("pallavi",16);
        Employees m5;
        m5=new Employees("suneel",29);
         m5.say();//you can call this also.
        Employees[] Emp={m1,m2,m3,m4};//Employees is a object array and passing references .
        for (Employees m:Emp) {
            m.say();
        }
    }
}
