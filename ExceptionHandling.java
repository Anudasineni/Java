public class ExceptionHandling {
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 0;
        try {
        /*If an exception occurs in try block then the control of  is passed to the corresponding catch block.
          * try block of statements can throw  exception. so we are placing these statements inside try and
          * handled the exception in catch block.
          *single try block can have multiple catch blocks.
             */

           // int n[]=new int[4];
           // System.out.println(n[5]=30);Warning: ArrayIndexOutOfBoundsException
            System.out.println(num1 / num2);//if there is no error in try block ,then catch block will not execute.

/* note:when ever exception is found in try block,control will be passed to the catch block.So the Statements which are there
*after the exception will not execute.example
 */
            System.out.println(num2);//this will not execute.

        }
        catch (ArithmeticException e)//this catch block will handle only if any ArithmeticException occurs in try block.
        {
            System.out.println(e);
            System.out.println(num1 + num2);

        }
        catch (ArrayIndexOutOfBoundsException e1){//this catch block will handle only if any ArrayIndexOutOfBoundsException
          // occurs in try block.
            System.out.println("Warning: ArrayIndexOutOfBoundsException");

        }
        catch (Exception e2){//this catch block handles all the exceptions.
            System.out.println("Warning: some exception.");

        }
        finally {
            System.out.println("out of try block");
        }
        System.out.println(num1*num2);
    }

}
