public class ExceptionHandling {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 0;
        try {
        /*If an exception occurs in try block then the control of  is passed to the corresponding catch block.
          * try block of statements can throw  exception. so we are placing these statements inside try and
          * handled the exception in catch block.
          *single try block can have multiple catch blocks.
             */

           // int n[]=new int[4];
           // System.out.println(n[5]=30);Warning: ArrayIndexOutOfBoundsException
            System.out.println(num1 / num2);// //statement1.if there is no error in try block ,then catch block will not execute.

/* note:when ever exception is found in try block,control will be passed to the catch block.So the Statements which are there in try-block
*after the exception will not execute.example
 */
            System.out.println(num1);//statement2.this will not execute,because exception is already found at 14.

        }
        catch (ArithmeticException e)//this catch block will handle only if any ArithmeticException occurs in try block.
        {
            System.out.println(e);//statement3
            System.out.println(num1 + num2);//statement4

        }
        catch (ArrayIndexOutOfBoundsException e1){//this catch block will handle only if any ArrayIndexOutOfBoundsException
          // occurs in try block.
            System.out.println("Warning: ArrayIndexOutOfBoundsException");//statement5

        }
        catch (Exception e2){//this catch block handles all the exceptions.
            System.out.println("Warning: some exception.");//statement6

        }
        finally {
            System.out.println("finally block");//statement7
        }
        System.out.println(num1*num2);//statement8  
        
        /*Statement 3 will print exception message.statement4,statement7,statement8 will execute.
    }

}
