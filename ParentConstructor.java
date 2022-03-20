public class ParentConstructor {
     ParentConstructor(){ //constructor name same as class name.
        System.out.println("constructor of parent");
    }
    //method overriding(declaring same method in both parent class and child class.we call child class method by creating child class object.
    void display(){
         System.out.println("parent method");
    }
}
class ChildConstructor extends ParentConstructor{
    ChildConstructor(){
        System.out.println("constructor of child");
    }
    void dispaly(){
        super.display();//calling display method of parent class.
        System.out.println("child method");
    }
    public static void main(String args[])
    {
        ChildConstructor obj=new ChildConstructor();//though created object for child,it by default invokes the constructor of parent class.
        obj.dispaly();//It will print child method.
    }
}
