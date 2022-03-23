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
        System.out.println("outer catch block");//

    }
    finally

    {
        System.out.println("outer final block");

    }

    }
}
