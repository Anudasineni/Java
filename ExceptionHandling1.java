import java.security.PublicKey;

public class ExceptionHandling1 {
    public static void main(String args[]){
        try{
            int arr[]=new int[4];
            arr[10]=10;
        }
        /*this code will give error.
        *we should always place this block [catch(Exception e)] at the end of all other specific exception catch blocks.
         *because we placed general catch at the first which means all the catch blocks after this catch block is not
       * reachable
         */
        catch(Exception e){
            System.out.println("Some Other Exception");
        }
        catch(ArithmeticException e){
            System.out.println(" should not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }

        System.out.println("Out of the try-catch block");
    }
}

