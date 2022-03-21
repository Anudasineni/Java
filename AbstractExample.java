 abstract class  Baseclass{
     /*abstract class:it can have abstract methods and concrete methods(normal methods).
     * there is no use of abstract class without derived class.
     * object cant be created for abstract class.here AbstractExample is concrete class.
      */

     public abstract void show();//abstract method.here we are just declaring method(not implementing)
     public void show1(){//normal method

         System.out.println("concrete method of base class");
     }
     static void method(){
         System.out.println("static method");
     }
}
//normal class
public class AbstractExample extends Baseclass{

    public void show(){//
        System.out.println("implementing abstract method of base class");
    }
    public void show1(){
        super.show1();
        System.out.println("concrete method of abstract example class");
    }
    public static void main(String args[]){
        AbstractExample a=new AbstractExample();
        a.show();
        a.show1();
        Baseclass.method();
    }
}
