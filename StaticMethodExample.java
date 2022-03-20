public class StaticMethodExample {
    /*static method,static variables,static class,static block.
     *STATIC METHOD ==>Normally to call a method we have to create object.but for static ,no need to create instance of class.
     * Suppose we have method anu() in class. we can just call a method without any object.If we make non-static then we should
     * need to create object of the class.
     */
    static void anu() {
        System.out.println("static method");
    }


    public static void main(String args[]) {
        anu();
    }

}














