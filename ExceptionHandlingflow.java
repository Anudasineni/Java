import java.security.PublicKey;
//Try-catch-finally flow
public class ExceptionHandlingflow {
    public static void main(String args[]) {
        int arr[] = new int[4];
        arr[0] = 10;
        int num = 1;
        int num1 = 2;
        try {
            System.out.println(num1);//statement1
            System.out.println(num);//statement2
            System.out.println(arr[0]);//statement3
        } catch (Exception e) {
            System.out.println(e);//statement4
        } finally {
            System.out.println("final block executed");//statement5
        }
        System.out.println("Out of the try-catch block");//statement6

/* Here there is no exception in try-block, so the control will not be passed to the catch block.finally  block will
 execute.i.e  statement 1,2,3,5,6 will execute.
 */

        try {
            int[] arr1 = new int[5];
            System.out.println(10); //statement7
            arr1[10] = 2;//ArrayIndexBoundException.
            System.out.println(11);//statement8(will not execute.Exception is already found).
        }
        catch (ArithmeticException e1) {
            System.out.println(e1); /*this catch-block will handle only ArithmeticException.When catch-block is
        mismatched ,the program will terminate abnormally.In this case also finally block will execute.*/
    }
        finally{
         System.out.println("This is Finally block");//statement9
        }
          System.out.println("Out of the try-catch block");//statement10

        /* statement7,statement9 will execute only.*/


        // when exception found in catch block.
        try {
            int n = 0;
            int n1 = 1;
            System.out.println(n1 / n);//statement 11
            System.out.println(n1);//statement12
        } catch (Exception e) {
            System.out.println(8 / 0);//statement13 (abnormal termination ,but before final block will execute).
        } finally {
            System.out.println("final is executed");//statement14
        }
        //only statement14 is executed
    }
    }



