public class StaticVariableExample {
    static  int i=9;
    static  String name="asfg";
    String weather="cool";
    //as already we kmow static method directly can access ,without creating object.
    //Static methods can directly can access in static methods and non-static methods.
    static  void meth(){
        System.out.println(i);//Static variables directly can access in "Static Methods".
        System.out.println(name);
        System.out.println("sttaic method");
        //System.out.println(weather);cannot access

    }
    void display(){
        System.out.println("jk"+i); //Static variables directly can access in "Non-Static Methods" also.
        meth();//calling static method in non-static method.
        System.out.println(weather);
    }
    static void meth1(){
        StaticVariableExample OBJ=new StaticVariableExample();
        OBJ.display();//accessing non-static method in static method with the help of  creating object.
        System.out.println("non-static");
        System.out.println(OBJ.weather);//can access with object in static method

    }
    public static void main(String args[]){
        StaticVariableExample O1=new StaticVariableExample();
        O1.display();
        meth();
        meth1();
    }
}
