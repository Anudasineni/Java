public class ExceptionHandlingNested {
    public static void main(String args[]) {
//try-catch-finally block in try block.
   try
    {
        System.out.println("outer try");
        try {
            System.out.println("inner try block");
            System.out.println(8/0);
            System.out.println(8);

        }
        catch (Exception e) {
            System.out.println("inner catch block");

        }
        finally {
            System.out.println("inner finally block");

        }
        System.out.println("after inner try block");

    }
    catch(Exception e)
    {
        System.out.println("outer catch block");//this will not execute because exception is already handled at inner catch block.

    }
    finally

    {
        System.out.println("outer final block");

    }
//when inner catch blocks are not handling any exception.Then control will look for outer catch block.  
      try{

        try {
            System.out.println("inner try block");
            System.out.println(8 / 0);
            System.out.println(8);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("inner catch block");//this will not execute because.this catch block will handle
            // ArrayindexBoundException only.So,the outer catch block will handle the exception.

        }
        finally {   
            System.out.println("inner finally block");

        }
        System.out.println("after inner try block");

    }
    catch(Exception e)
    {
        System.out.println("outer catch block");//if the exception is not handled here as well then the program will terminate abruptly showing complile generated message.

    }
    finally

    {
        System.out.println("outer final block");

    }
//try-catch finally block in nested try.
     try {//main try-block

         try {//try-block1
             try { //try-block2
                 System.out.println("try-block2");

                 int[] arr=new int[3];
                 arr[6]=10;
             } catch (ArithmeticException e) {
                 System.out.println("ArithmeticException");
                 System.out.println("handled in try-block2");

             } 
             finally {
                 System.out.println("final try-block2" );
             }
         }
         catch (ArithmeticException e1) {
             System.out.println("ArithmeticException");
             System.out.println("handeled in try-block1");

         } 
         finally {
             System.out.println("final of try-block1");
         }
     }
     catch (ArithmeticException e2){
         System.out.println("ArithmeticException");
         System.out.println("handled in main try-block");

     }
     catch (ArrayIndexOutOfBoundsException e3){
         System.out.println("ArrayIndexBoundException");
         System.out.println("handled in main try-block");

     }
     catch (Exception e4){
         System.out.print("Exception");
         System.out.println("handled in main try-block");

     }
     finally {
         System.out.println("final main try-block");
     }
        System.out.print("next");
/* ArrayIndexOutOfBoundsException occurred in the  try-block2.Since try-block2 is not handling this exception,
the control then gets transferred to the parent try-block1 and looked for the catch handlers in try-block1.
 Since the try-block1 is also not handling that exception,the control gets transferred to the main  try-block
where it found the suited catch block(ArrayIndexBoundException) for exception.This is how the nesting structure works.
 */

    }
}

