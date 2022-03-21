 abstract class A{
     abstract void display();

    public void show(){
        System.out.println("concrete method A");
    }
    public static void method(){
        System.out.println("static method");
    }
}
abstract  class B extends A{
    void display(){
        System.out.println("implementation abstraction method of class A");
    }
    abstract void display1();//for implementing this method we need create another class.becuause class b is also abstract class.we cant implement display1()
    //in class B.
    public void show(){
        //super.show();
        System.out.println("concrete method B");
    }
}
class C extends B{
    void display1() {
        System.out.println("implementation abstraction method of class B");
    }

    public void show(){
       // super.show();it will call show method of previous of class
        System.out.println("concrete method in C");
    }
}
public  class AbstractMethod {
    public static void main(String args[]){
        C obj=new C();//created object for class.cause we cannot object for class A and Class B.
        obj.display1();
        obj.display();
        obj.show();
        A.method();

    }

}
