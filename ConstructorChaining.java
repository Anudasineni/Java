 /*Constructor chaining=>calling constructor from another constructor with in the same class or different class.

  *If you want call a constructor with in the same class then we can use this() keyword.or
 * if you want to call it from another class,we can use super() keyword.
 *this() should be the first line of constructor.
 *there should be the at least one constructor without this keyword.
  */
//We have created class anu in which we have 3 construtcors.
 class anu{
    anu(){// default constructor 1

        //this(3) means single parameter constructor of same class(parameterized constructor 2)

        this(3); //here it will call  parameterized constructor 2
        System.out.println("constructor of anu class");
    }
    anu(int a){//parameterized constructor 2

        this(4,5);// and the control comes there and it will call parameterized constructor 3
        System.out.println(a);
    }
   anu(int a,int b){ //parameterized constructor 3

       System.out.println( a+b); // so ,it will print first.
   }
}
 class shashi extends anu {
    shashi(){
        super();//then from this it will go to anu default constructor. 
        System.out.println("constructor of shashi class");
    }

}


public class ConstructorChaining {
    public static void main(String args[]){

        new shashi();//  the control will go shashi constructor
    }
}
